public class Product {
    // Declare private variables
    private double prodCost;
    private double orderQuantity;
    private String prodName;
    private String prodUnits;

    // Class constructor
    public Product(double cost, double quantity, String name, String unit) {
        this.prodCost = cost;
        this.orderQuantity = quantity;
        this.prodName = name;
        this.prodUnits = unit;
    }

    public void printProduct() {
        System.out.println("\n" + this.orderQuantity + " " + this.prodUnits + " of " + this.prodName + " were purchased " +
                "at a price of $" + roundPrice(this.prodCost) + " each.");
    }

    public void totalCost() {
        System.out.println("\nTotal cost is " + roundPrice(this.prodCost * this.orderQuantity));
    }

    public String roundPrice(double price) {
        return String.format("%.2f", price);
    }

}

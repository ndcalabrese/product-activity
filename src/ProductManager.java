public class ProductManager {

    public static void main(String[] args) {

        // Instantiate new product
        Product bananas = new Product(0.62, 5, "bananas", "bushels");
        Product tacos = new Product(1.50, 3, "tacos", "plates");

        bananas.printProduct();
        bananas.totalCost();

        tacos.printProduct();
        tacos.totalCost();

    }

}

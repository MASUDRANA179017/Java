public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();

        // Create
        Product product1 = new Product(1, "Laptop", 1200.00);
        Product product2 = new Product(2, "Smartphone", 800.00);
        productService.addProduct(product1);
        productService.addProduct(product2);

        // Read
        System.out.println("All products: " + productService.getAllProducts());
        System.out.println("Get product with ID 1: " + productService.getProduct(1));

        // Update
        productService.updateProduct(1, "Gaming Laptop", 1500.00);

        // Delete
        productService.deleteProduct(2);
        System.out.println("All products after deletion: " + productService.getAllProducts());
    }
}

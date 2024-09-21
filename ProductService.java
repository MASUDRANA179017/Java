import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> products = new ArrayList<>();

    // Create
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product);
    }

    // Read
    public Product getProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public List<Product> getAllProducts() {
        return products;
    }

    // Update
    public void updateProduct(int id, String name, double price) {
        Product product = getProduct(id);
        if (product != null) {
            product.setName(name);
            product.setPrice(price);
            System.out.println("Product updated: " + product);
        } else {
            System.out.println("Product not found.");
        }
    }


    // Delete
    public void deleteProduct(int id) {
        Product product = getProduct(id);
        if (product != null) {
            products.remove(product);
            System.out.println("Product deleted: " + product);
        } else {
            System.out.println("Product not found.");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casestudyjava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale.Category;

/**
 *
 * @author admin
 */
public class ProductManager {
    private List<Product> products = new ArrayList<>();
    private static final String FILENAME = "products.dat";
    private static final String CATEGORY_FILENAME = "categories.dat";
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added successfully.");
    }
    public void editProduct(int productId, Product updatedProduct) {
        for (Product product : products) {
            if (product.getId() == productId) {
                product.setName(updatedProduct.getName());
                product.setCategory(updatedProduct.getCategory());
                product.setPrice(updatedProduct.getPrice());
                product.setQuantity(updatedProduct.getQuantity());
                System.out.println("Product updated successfully.");
                return;
            }
        }
        System.out.println("Product with ID " + productId + " not found.");
    }

    public void deleteProduct(int productId) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId() == productId) {
                iterator.remove();
                System.out.println("Product deleted successfully.");
                return;
            }
        }
        System.out.println("Product with ID " + productId + " not found.");
    }

    public void displayAllProducts() {
        System.out.println("All Products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void displayProductsByCategory(String category) {
        System.out.println("Products in Category " + category + ":");
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                System.out.println(product);
            }
        }
    }
    public void sortProductsByPrice() {
    Collections.sort(products, new Comparator<Product>() {
        @Override
        public int compare(Product p1, Product p2) {
            return Double.compare(p1.getPrice(), p2.getPrice());
        }
    });
    }
    public void sortProductsByQuantity() {
    Collections.sort(products, new Comparator<Product>() {
        @Override
        public int compare(Product p1, Product p2) {
            return Integer.compare(p1.getQuantity(), p2.getQuantity());
        }
    });
    System.out.println("Products sorted by quantity:");
    displayAllProducts();
}
    public void searchProductByName(String keyword) {
    System.out.println("Search results for products with name containing '" + keyword + "':");
    boolean found = false;
    for (Product product : products) {
        if (product.getName().toLowerCase().contains(keyword.toLowerCase())) {
            System.out.println(product);
            found = true;
        }
    }
    if (!found) {
        System.out.println("No products found with name containing '" + keyword + "'.");
    }
}
    public void searchProductByPriceRange(double minPrice, double maxPrice) {
    System.out.println("Search results for products within price range " + minPrice + " - " + maxPrice + ":");
    boolean found = false;
    for (Product product : products) {
        if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
            System.out.println(product);
            found = true;
        }
    }
    if (!found) {
        System.out.println("No products found within the specified price range.");
    }
}
    
    // Lưu danh sách sản phẩm vào file
    public void saveProductsToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            oos.writeObject(products);
            System.out.println("Products saved to file: " + FILENAME);
        } catch (IOException e) {
            System.err.println("Error saving products to file: " + e.getMessage());
        }
    }

    // Tải danh sách sản phẩm từ file
    public void loadProductsFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))) {
            products = (List<Product>) ois.readObject();
            System.out.println("Products loaded from file: " + FILENAME);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading products from file: " + e.getMessage());
        }
    }
}

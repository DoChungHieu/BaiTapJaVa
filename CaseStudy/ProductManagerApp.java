/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casestudyjava;


import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ProductManagerApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ProductManager productManager = new ProductManager();
        UserManager userManager = new UserManager();
        Scanner scanner = new Scanner(System.in);
            int choice = -1;
            while(choice != 0){
                System.out.println("1.Register");
                System.out.println("2.Login");
                System.out.println("0.Exit");
                System.out.println("Nhập lựa chọn:");
                choice = scanner.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("Nhập username:");
                        String newUsername = scanner.next();
                        System.out.println("Nhập password:");
                        String newPassword = scanner.next();
                        userManager.register(newUsername, newPassword);
                        break;
                    case 2:
                        System.out.println("Username");
                        String username = scanner.next();
                        System.out.println("Password");
                        String password = scanner.next();
                        if(userManager.login(username, password)){
                            System.out.println("Login successful!");
                            int userchoice = -1;
                            while(userchoice !=0){
                                System.out.println("Product Management System Menu:");
                                System.out.println("1. Add Product");
                                System.out.println("2. Edit Product");
                                System.out.println("3. Delete Product");
                                System.out.println("4. Display All Products");
                                System.out.println("5. Display Products by Category");
                                System.out.println("6. Sắp xếp theo giá");
                                System.out.println("7. Sắp xếp theo số lượng");
                                System.out.println("8. Tìm kiếm theo tên gần đúng");
                                System.out.println("9. Tìm kiếm theo khoảng giá");
                                System.out.println("10. Exit");
                                System.out.print("Enter your choice: ");
                                choice = scanner.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.print("Enter product ID: ");
                                        int id = scanner.nextInt();
                                        scanner.nextLine(); // Consume newline
                                        System.out.print("Enter product name: ");
                                        String name = scanner.nextLine();
                                        System.out.print("Enter product category: ");
                                        String category = scanner.nextLine();
                                        System.out.print("Enter product price: ");
                                        double price = scanner.nextDouble();
                                        System.out.print("Enter product quantity: ");
                                        int quantity = scanner.nextInt();
                                        Product newProduct = new Product(id, name, category, price, quantity);
                                        productManager.addProduct(newProduct);
                                        productManager.saveProductsToFile();
                                        break;

                                    case 2:
                                        System.out.print("Enter product ID to edit: ");
                                        int editId = scanner.nextInt();
                                        scanner.nextLine(); // Consume newline
                                        System.out.print("Enter updated product name: ");
                                        String updatedName = scanner.nextLine();
                                        System.out.print("Enter updated product category: ");
                                        String updatedCategory = scanner.nextLine();
                                        System.out.print("Enter updated product price: ");
                                        double updatedPrice = scanner.nextDouble();
                                        System.out.print("Enter updated product quantity: ");
                                        int updatedQuantity = scanner.nextInt();
                                        Product updatedProduct = new Product(editId, updatedName, updatedCategory, updatedPrice, updatedQuantity);
                                        productManager.editProduct(editId, updatedProduct);
                                        break;                    
                                    case 3:
                                        System.out.print("Enter product ID to delete: ");
                                        int deleteId = scanner.nextInt();
                                        productManager.deleteProduct(deleteId);
                                        break;
                                    case 4:
                                        // Display All Products
                                        productManager.displayAllProducts();
                                       
                                        break;
                                    case 5:
                                        // Display Products by Category
                                        System.out.print("Enter category to display products: ");
                                        String displayCategory = scanner.next();
                                        productManager.displayProductsByCategory(displayCategory);
                                        break;
                                    case 6:
                                        System.out.println("Products sorted by price:");
                                        productManager.sortProductsByPrice();
                                        productManager.displayAllProducts();
                                        break;
                                    case 7:
                                        System.out.println("Sản phẩm sắp xếp theo số lượng:");
                                        productManager.sortProductsByQuantity();
                                        break;
                                    case 8:
                                        //Tìm kiếm theo tên gần đúng
                                        System.out.print("Enter keyword to search for products by name: ");
                                        String searchKeyword = scanner.next();
                                        productManager.searchProductByName(searchKeyword);
                                        break;
                                    case 9:
                                        System.out.print("Enter minimum price: ");
                                        double minPrice = scanner.nextDouble();
                                        System.out.print("Enter maximum price: ");
                                        double maxPrice = scanner.nextDouble();
                                        productManager.searchProductByPriceRange(minPrice, maxPrice);
                                        break;
                                    case 10:
                                        System.out.println("Exiting Product Management System. Goodbye!");
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("Invalid choice. Please enter a valid option.");
                                }
                            }
                        }
                    case 0:
                        break;
                }
            }
        }
    }

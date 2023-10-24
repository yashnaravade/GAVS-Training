package com.demo.HibernateDemo;

import java.util.Scanner;

import com.demo.HibernateDemo.entities.Product;

public class App {
    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1. Create Product");
            System.out.println("2. Read Product by ID");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    // Create a new product
                    System.out.print("Enter Product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Product Category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter Product Price: ");
                    double price = scanner.nextDouble();

                    Product newProduct = new Product(id, name, category, price);
                    productDAO.createProduct(newProduct);
                    System.out.println("Product created successfully.");
                    break;

                case 2:
                    // Read a product by ID
                    System.out.print("Enter Product ID to retrieve: ");
                    int productId = scanner.nextInt();
                    Product retrievedProduct = productDAO.getProductById(productId);
                    System.out.println("Retrieved Product: " + retrievedProduct);
                    break;

                case 3:
                    // Update the product
                    System.out.print("Enter Product ID to update: ");
                    int productIdToUpdate = scanner.nextInt();
                    scanner.nextLine(); 
                    Product productToUpdate = productDAO.getProductById(productIdToUpdate);

                    if (productToUpdate != null) {
                        System.out.print("Enter new Product Name: ");
                        String newName = scanner.nextLine();
                        productToUpdate.setPrdName(newName);
                        productDAO.updateProduct(productToUpdate);
                        System.out.println("Product updated successfully.");
                    } else {
                        System.out.println("Product not found for update.");
                    }
                    break;

                case 4:
                    // Delete a product
                    System.out.print("Enter Product ID to delete: ");
                    int productIdToDelete = scanner.nextInt();
                    Product productToDelete = productDAO.getProductById(productIdToDelete);

                    if (productToDelete != null) {
                        productDAO.deleteProduct(productToDelete);
                        System.out.println("Product deleted successfully.");
                    } else {
                        System.out.println("Product not found for deletion.");
                    }
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting the application.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}

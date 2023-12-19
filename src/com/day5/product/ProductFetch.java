package com.day5.product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Scanner;

public class ProductFetch {

    public static void main(String[] args) {
        // Fetch product based on Product ID
        fetchProduct();
    }

    private static void fetchProduct() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stocks.ser"))) {
            // Read the list of products from the file
            List<Product> productList = (List<Product>) ois.readObject();
           Product p = new Product(1, "b");
            productList.add(p);

            if (productList.isEmpty()) {
                System.out.println("Please enter Stock Details.");
                return;
            }

            // Get input for product ID
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter product ID: ");
            int targetProductId = scanner.nextInt();
scanner.nextLine();
            // Find the product in the list
            Product foundProduct = null;
            for (Product product : productList) {
                if (product.getProductId() == targetProductId) {
                    foundProduct = product;
                   // break;
                }
            }

            // Display result
            if (foundProduct != null) {
                System.out.println("Product Name: " + foundProduct.getProductName());
            } else {
                System.out.println("Product not found. Please enter a valid product ID.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Please enter Stock Details.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
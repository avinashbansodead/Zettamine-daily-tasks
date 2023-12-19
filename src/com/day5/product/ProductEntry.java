package com.day5.product;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductEntry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many products to be saved: ");
        int n = sc.nextInt();

        // List to store products
        List<Product> productList = new ArrayList<>();

        // Enter product details
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter product id & product name of Product-" + i + ": ");
            int productId = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            String productName = sc.nextLine();

            // Create a new Product object
            Product product = new Product(productId, productName);

            // Add the product to the list
            productList.add(product);
        }

        // Save product details to file using serialization
        saveProductsToFile(productList);

        System.out.println("Product details saved to stocks.ser");
    }

    private static void saveProductsToFile(List<Product> productList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stocks.ser"))) {
            oos.writeObject(productList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

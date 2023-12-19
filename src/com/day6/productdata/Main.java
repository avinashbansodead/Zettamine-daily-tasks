package com.day6.productdata;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Product Details");
            System.out.println("2. Search Product based on price range");
            System.out.println("3. Close");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    Product newProduct = new Product();
                    newProduct.addProduct();
                    products.add(newProduct);
                    System.out.println("Product added successfully!");
                    break;
                case 2:
                    searchProductByPriceRange(products);
                    break;
                case 3:
                    System.out.println("Closing the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } 
        while (choice != 3);
    }

    private static void searchProductByPriceRange(List<Product> products) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter minimum price: ");
        double minPrice = sc.nextDouble();
        System.out.print("Enter maximum price: ");
        double maxPrice = sc.nextDouble();

        System.out.println("Products within the price range:");
        for (Product product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice)
            {
                product.displayProductDetails();
                System.out.println();
            }
        }
    }
}



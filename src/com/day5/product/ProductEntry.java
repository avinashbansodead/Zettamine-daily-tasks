package com.day5.product;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductEntry 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many products to be saved: ");
        int n = sc.nextInt();

        List<Product> productList = new ArrayList<>();

        for (int i = 1; i <= n; i++) 
        {
            System.out.print("Enter product id & product name of Product-" + i + ": ");
            int productId = sc.nextInt();
            sc.nextLine(); 
            String productName = sc.nextLine();

            Product product = new Product(productId, productName);

            productList.add(product);
        }

        saveProductsToFile(productList);

        System.out.println("Product details saved to stocks.ser");
    }

    private static void saveProductsToFile(List<Product> productList) 
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stocks.ser"))) 
        {
            oos.writeObject(productList);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

package com.day6.productdata;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
class Product {
    private String prodCode;
    private String prodName;
    private int availability;
    private double price;

   public void addProduct()
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product Code: ");
        prodCode = sc.nextLine();
        System.out.print("Enter Product Name: ");
        prodName = sc.nextLine();
        System.out.print("Enter Availability: ");
        availability = sc.nextInt();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    public void displayProductDetails() 
    {
        System.out.println("Product Code: " + prodCode);
        System.out.println("Product Name: " + prodName);
        System.out.println("Availability: " + availability);
        System.out.println("Price: " + price);
    }

    public double getPrice() 
    {
        return price;
    }
}


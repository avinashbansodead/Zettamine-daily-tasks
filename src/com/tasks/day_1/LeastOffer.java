package com.tasks.day_1;

import java.util.Arrays;
import java.util.Scanner;

public class LeastOffer 
{
	static int minDiscountAmount=Integer.MAX_VALUE;
	static StringBuilder sb=new StringBuilder();
     
    public static void main(String[] args) 
    {
    	//Create Scanner Object
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the number of items: ");
    	int numOfItems = sc.nextInt();
    	
    	int[]discount = new int[numOfItems];
    	String[]items = new String[numOfItems];
    	
    	// move the cursor to the nextLine
    	sc.nextLine();
    	
    	// Initalizing the loop for seraching minDiscountAmount
        for (int i = 0; i < numOfItems; i++)
        {
        	System.out.print("Enter item details (name, price, discount percentage): ");
            String[] itemDetails = sc.nextLine().split(",");
            
            String itemName = itemDetails[0].trim();
            int price = Integer.parseInt(itemDetails[1].trim());
            int discountPercentage = Integer.parseInt(itemDetails[2].trim());
            
            int discountAmount=(price*discountPercentage)/100;
            
            //Store discountAmount in discount[] and itemName in item[]
            discount[i]=discountAmount;
            items[i]=itemName;
        	
            if (discountAmount < minDiscountAmount) 
            {
            		minDiscountAmount=discountAmount;
            }
        }
        	sc.close();
        
        	//Initalizing for loop for printing other minimum discount items
        	for(int j=0;j< numOfItems;j++)
        {
        	if(minDiscountAmount==discount[j])
        	{
        		sb.append(items[j]+" ");
        	}
        }
        
        System.out.print(sb.toString());
    }
}

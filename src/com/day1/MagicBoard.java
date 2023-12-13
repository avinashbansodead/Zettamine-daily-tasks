package com.day1;

import java.util.Scanner;

public class MagicBoard 
{
    public static void main(String[] args) 
    {
    	// Create a Scanner object for taking the input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        System.out.println("Enter 4 Numbers:");

        // Create array to store the entered numbers
        int[] num = new int[4];

        // Initalize loop to get 4 numbers
        for (int i = 0; i < num.length; i++) 
        {
            num[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("\n Output:");
        
        for (int i = 0; i < num.length; i++) 
        {
        	char ch=(char)num[i];
            System.out.println(num[i] + "-" + ch);
        }
    }
}

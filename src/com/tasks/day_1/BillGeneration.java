package com.tasks.day_1;
import java.util.Scanner;

public class BillGeneration 
{
	public static void main(String[] args) 
	{
		// Create Scanner class object for taking input from the user
	    Scanner sc = new Scanner(System.in);
	    
	    //Input for number of Pizza's
	    System.out.print("Enter the no of pizzas bought: ");
	    int noOfPizzas = sc.nextInt();
	    
	    //Input for number of Puffs
	    System.out.print("Enter the no of puffs bought: ");
	    int noOfPuffs = sc.nextInt();
	    
	    //Input for number of Cooldrinks
	    System.out.print("Enter the no of cool drinks bought: ");
	    int noOfCoolDrinks = sc.nextInt();
	    
	    //Close scanner object for avoiding resource leak
	    sc.close();

	    // Calculating total cost for each item
	    int costOfPizza = noOfPizzas * 100;
	    int costOfPuffs = noOfPuffs * 20;
	    int costOfCoolDrinks = noOfCoolDrinks * 10;

	    // Calculating the total price
	    double totalPrice = costOfPizza + costOfPuffs + costOfCoolDrinks;

	    //Printing expected bill
	    System.out.println("\n"+"=".repeat(50));
	    System.out.println("\t\t -Bill Details-");
	    System.out.println("=".repeat(50));
	    System.out.println("No of Pizzas: \t   |\t" + noOfPizzas + "\t|  Cost: " + costOfPizza);
	    System.out.println("-".repeat(50));
	    System.out.println("No of Puffs:  \t   |\t" + noOfPuffs + "\t|  Cost: " + costOfPuffs);
	    System.out.println("-".repeat(50));
	    System.out.println("No of Cool Drinks: |\t" + noOfCoolDrinks + "\t| Cost: " + costOfCoolDrinks);
	    System.out.println("=".repeat(50));
	    System.out.println("Total price= " + totalPrice );
	    System.out.println("ENJOY THE SHOW!!!");
	    System.out.println("=".repeat(50));
	    
	}
}



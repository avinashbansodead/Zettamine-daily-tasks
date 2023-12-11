package com.tasks.day_1;
import java.util.Scanner;

public class AverageAgeCalculation 
{
	public static void main(String[] args)
    {
    	//Create scanner object for taking inputs from users
        Scanner sc = new Scanner(System.in);

        // Input the total number of employees
        System.out.print("Enter total no. of employees: ");
        int totalEmployees = sc.nextInt();
        
        //Check totalEmployees are greater than one
        if(totalEmployees > 1)
        {
        	//Create array for storing the age of employees
        	int [] employeeAge = new int [totalEmployees];
        	System.out.println("Enter the age for " + totalEmployees + " employees:");
         
        	//Initalizing for loop for storing the age of particular employee
            for (int i = 0; i < totalEmployees; i++) 
            {
            	// Input the age for each employee
            	int age = sc.nextInt();
            	
            	//Check weather the age is between 28 and 40
            	if( age >= 28 && age <= 40)
            	{
            		employeeAge[i] = age;
            	}
            	else
            	{
            		System.out.println("Invalid Age Encountered!"); 
            	}
                
            }

            //  Display the average age
            double averageAge = calculateAverage(employeeAge);
            System.out.printf("The average age is %.2f%n", averageAge);
            //Close scanner object for avoiding resource leak
            sc.close();
        }
        else
        {
        	 System.out.println("Please enter a valid employee count");
             
        }
        
    }

	//Create method for calculate the average age
    public static double calculateAverage(int[] employeeAge)
    {
        int sum = 0;
       
        for (int i = 0; i < employeeAge.length; i++)
        {  
        	sum += employeeAge[i];                
        }
        //Expression for average age
        double average=(double)sum/employeeAge.length;
        System.out.println(sum);
        
        // Calculate and return the average age
       return average;
    }
    
}


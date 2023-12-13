package com.day2.employeeLoan;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
    	//Create scanner object for taking inputs from users
    	Scanner sc= new Scanner(System.in);
    	
    	System.out.print("Enter the employeeId: ");
    	int employeeId= sc.nextInt();
    	sc.nextLine();
    	
    	System.out.print("Enter the employeeName: ");
    	String employeeName=sc.nextLine();
    	
    	System.out.print("Enter 'y' if employee is permanent: ");
    	char option=sc.next().charAt(0);
    	
    	Loan loan = new Loan();
    	
    	// If employee is permanent then display employee name along with loan
        if(option=='y'||option=='Y')
        {
        System.out.print("Enter the employee salary: ");
        double salary=sc.nextDouble();
        
        //Pass value  to permanentEmployee constructor.
        PermanentEmployee permanentEmployee = new PermanentEmployee(employeeId,employeeName,salary);
        double permanentEmployeeLoan = loan.calculateLoanAmount(permanentEmployee);
       
        System.out.println(employeeName+ " is a Permanent Employee");
        System.out.println("Loan Amount: " + permanentEmployeeLoan);
        }
        
        //If employee is not permanent then display employee name along with name
        else 
        {
        System.out.print("Enter the number of hours employee worked: ");
        int hoursWorked=sc.nextInt();
        System.out.print("Enter the hourlyWages: ");
        int hourlyWages=sc.nextInt();
        
        //Assign value to the temporaryEmployee constructor
        TemporaryEmployee temporaryEmployee = new TemporaryEmployee(employeeId,employeeName,hoursWorked,hourlyWages);
        double temporaryEmployeeLoan = loan.calculateLoanAmount(temporaryEmployee);
        
        System.out.println(employeeName+ " is a temoraryEmployee");
        System.out.println("Loan Amount: " + temporaryEmployeeLoan);
        }
        //Close the scanner object.
        
        sc.close();
       }
}


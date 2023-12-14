package com.day4.vehicleloan;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) 
	 {
	     Scanner sc=new Scanner(System.in);
	     
	     System.out.print("Enter Vehicle Number: ");
	     String vehicleNumber=sc.nextLine();
	     
	     System.out.print("Enter Model Number: ");
	     String modelNumber=sc.nextLine();
	     
	     System.out.println("Select Vehicle type");
	     System.out.println("1. Two wheeler");
	     System.out.println("2. Three wheeler");
	     System.out.println("3. Four wheeler");
	     System.out.print("Enter Vehcile Type: ");
	     int option=sc.nextInt();
	    // sc.nextLine();
	     String vehicleType=getVehicleType(option);
	     System.out.print("Enter the price: "+ (char)8377+" ");
	     double price=sc.nextDouble();
	     
	    if(price>0) 
	    {
	    	 Vehicle vehicle = new Vehicle(vehicleNumber,modelNumber,vehicleType,price);
	    	 VehicleLoanAndInsurance loanInsurance= new VehicleLoanAndInsurance(vehicle);
	    	 double loanAmount = loanInsurance.issueLoan();
		     double insuranceAmount = loanInsurance.takeInsurance();

		     System.out.println("Loan Amount: " + (char)8377+" "+ loanAmount);
		     System.out.println("Insurance Amount: "  + (char)8377+" "+ insuranceAmount);
	    	 
	    }
	    else
	    {
	    	System.out.println("Enter valid vehicle price");
	    }
	     
	    
	     

	    
	 }

	public static String getVehicleType(int option) 
	{
		String type = null;
		switch(option)
	     {
	    	 case 1:type= "Two wheeler"; break;
	    	 case 2:type= "Three wheeler";break;
	    	
	    	 case 3:type="Four wheeler";break;
	    	 default:System.out.println("Enter correct option");
	     }
		return type;
		 
	}
	}


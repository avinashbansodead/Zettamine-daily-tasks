package com.day4.vehicleloan;

public class VehicleLoanAndInsurance implements Loan, Insurance
{
	 private Vehicle vehicle;

	 public VehicleLoanAndInsurance(Vehicle vehicle) 
	 {
	     this.vehicle = vehicle;
	 }

	 @Override
	 public double issueLoan() 
	 {
	     if ("Four wheeler".equals(vehicle.getVehicleType())) 
	     {
	         return 0.8 * vehicle.getPrice();
	     } 
	     else if ("Three wheeler".equals(vehicle.getVehicleType()))
	     {
	         return 0.75 * vehicle.getPrice();
	     } 
	     else if ("Two wheeler".equals(vehicle.getVehicleType())) 
	     {
	         return 0.5 * vehicle.getPrice();
	     }
	     return 0;
	 }

	 @Override
	 public double takeInsurance()
	 {
	     if (vehicle.getPrice() <= 150000) 
	     {
	         return 3500;
	     } 
	     else if (vehicle.getPrice() > 150000 && vehicle.getPrice() <= 300000) 
	     {
	         return 4000;
	     }
	     else if (vehicle.getPrice() > 300000) 
	     {
	    	 return 5000; 
	     }
	     else 
	     {
	        return 0; 
	     }
	 }
	}
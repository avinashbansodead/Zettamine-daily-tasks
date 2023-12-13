package com.day2.employeeLoan;

public class PermanentEmployee extends Employee 
{
    private double basicPay;

    public PermanentEmployee(int employeeId, String employeeName, double basicPay) 
    {
    	super(employeeId, employeeName);
        this.basicPay = basicPay;
        calculateSalary();
    }

    @Override
    public void calculateSalary() 
    {
        double pfAmount = basicPay * 0.12;
        salary = basicPay - pfAmount;
    }

    // Getters and setters for basicPay

    // ...

}

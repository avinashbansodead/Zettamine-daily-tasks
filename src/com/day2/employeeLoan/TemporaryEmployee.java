package com.day2.employeeLoan;

public class TemporaryEmployee extends Employee {
    private int hoursWorked;
    private int hourlyWages;

    //Create TemperoraryEmployee constructor
    public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) 
    {
        super(employeeId, employeeName);
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
        calculateSalary();
    }

    @Override
    public void calculateSalary() 
    {
        salary = hoursWorked * hourlyWages;
    }

   
}

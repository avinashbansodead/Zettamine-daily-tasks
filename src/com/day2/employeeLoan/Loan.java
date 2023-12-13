package com.day2.employeeLoan;

public class Loan 
{
    public double calculateLoanAmount(Employee emp) 
    {
        if (emp instanceof PermanentEmployee)
        {
            return 0.15 * emp.salary;
        } 
        
        else if (emp instanceof TemporaryEmployee) 
        {
            return 0.10 * emp.salary;
        } 
        
        else 
        {
            
            return 0;
        }
    }
}

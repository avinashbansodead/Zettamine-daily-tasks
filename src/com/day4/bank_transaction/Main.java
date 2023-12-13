package com.day4.bank_transaction;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A/C number: ");
        int accountNumber = sc.nextInt();
        
        System.out.print("Enter customer id: ");
        int customerId = sc.nextInt();
        
        System.out.print("Enter customer name: ");
        String customerName = sc.next();
        
        System.out.print("Enter customer email: ");
        String emailId = sc.next();
        
        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();
        
        System.out.print("Enter minimum balance: ");
        double minimumBalance = sc.nextDouble();
        
        Customer customer = new Customer(customerId, customerName, emailId);
        SavingsAccount savingsAccount = new SavingsAccount(accountNumber, customer, balance, minimumBalance);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        savingsAccount.withdraw(withdrawAmount);

        sc.close();
    }
}
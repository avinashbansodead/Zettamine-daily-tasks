package com.day4.bank_transaction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter

public class SavingsAccount extends Account
{
    public SavingsAccount(int accountNumber, Customer customerObj, double balance, double minimumBalance) {
		super(accountNumber, customerObj, balance);
		this.minimumBalance = minimumBalance;
	}


	private double minimumBalance;

   
    @Override
    public boolean withdraw(double withdrawAmount)
    {
    	double expectedBalance=super.balance - withdrawAmount ;
        if (expectedBalance >= minimumBalance) {
            super.balance =super.balance - withdrawAmount;
            System.out.printf("Rs. %.2f debited | Balance: Rs. %.2f%n", withdrawAmount, balance);
            return true;
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
            return false;
        }
    }
}



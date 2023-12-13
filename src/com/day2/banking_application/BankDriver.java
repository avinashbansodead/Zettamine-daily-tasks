package com.day2.banking_application;

import java.util.Scanner;

public class BankDriver
{
	public static void main(String[] args) 
	{
	 Scanner sc= new Scanner(System.in);
	 Bank bank= new Bank();
	
	for(; ;)
		{
			System.out.println("1. Create");
			System.out.println("2. Deposit" );
			System.out.println("3. Withdraw");
			System.out.println("4. Details");
			System.out.println("5. Exist");
			System.out.println();
			System.out.print("Enter an option: ");
			int option=sc.nextInt();
			
			switch(option)
			{
			case 1: bank.checkAccount();break;
			case 2: bank.deposit();break;
			case 3:bank.withdraw();break;
			case 4:bank.details();break;
			case 5:bank.exist();break;
			default:System.out.println("Enter valid option");
			}
		}
	}
}

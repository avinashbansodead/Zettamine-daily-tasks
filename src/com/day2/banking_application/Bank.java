package com.day2.banking_application;

import java.util.Scanner;

public class Bank 
{
Account ac;
static Scanner sc= new Scanner(System.in );


	public void checkAccount()
	{
		if(ac==null)
		{
			System.out.println("Please open account with us");
			createAccount();
		}
		else 
		{
			System.out.println("Account is already opened with us");
		}
	}
	
	public void createAccount()
	{
		System.out.println("Enter your account details");
		System.out.println();
		System.out.println("Enter account number: ");
		long accono=sc.nextLong();
		System.out.println("Enter name");
		String accname=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter initial deposit");
		int initialDeposit=sc.nextInt();
		
		ac=new Account(accono,accname,initialDeposit);
	}
	
	public void deposit()
	{
		if(ac!=null)
		{
		System.out.println("Enter ammount to deposit: ");
		double damt=sc.nextDouble();
		double newBal=ac.getBalance()+ damt;
		ac.setBalance(newBal);
		}
		else
		{
			System.out.println("Please open account with us.");
		}
	}
	
	public void withdraw()
	{
		if(ac!=null)
		{
		System.out.println("Enter ammount to withdraw");
		double wamt=sc.nextDouble();
		if(wamt<=ac.getBalance())
		{
			double newBal=ac.getBalance()-wamt;
			ac.setBalance(newBal);
			System.out.println(wamt+ " debited sucefully");
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
		}
		else
		{
			System.out.println("Please open account with us.");
		}
		
	}
	
	public void details()
	{
		if(ac!=null)
		{
		System.out.println("A/C NO: "+ ac.getAccnno());
		System.out.println("Name: "+ac.getAccname() );
		System.out.println("Balance: "+ ac.getBalance());
		}
		else
		{
			System.out.println("Please open account with us.");
		}
	}
	
	public void exist()
	{
		System.out.println("Bye-Bye");
		System.exit(0);
	}
	
}

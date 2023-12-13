package com.day2.banking_application;

public class Account
{
  private long accnno;
  private String accname;
  private int initialDeposit;
  static double balance;

public Account(long accnno, String accname, int initialDeposit) 
{
	super();
	this.accnno = accnno;
	this.accname = accname;
	this.initialDeposit = initialDeposit;
	balance=initialDeposit;
	System.out.println("Account opened");
}

public long getAccnno() 
{
	return accnno;
}
public void setAccnno(long accnno) 
{
	this.accnno = accnno;
}


public String getAccname()
{
	return accname;
}
public void setAccname(String accname) 
{
	this.accname = accname;
}


public int getInitialDeposit() 
{
	return initialDeposit;
}
public void setInitialDeposit(int initialDeposit)
{
	this.initialDeposit = initialDeposit;
}

public double getBalance() 
{
	return balance;
}
public void setBalance(double balance) 
{
	this.balance = balance;
}

}

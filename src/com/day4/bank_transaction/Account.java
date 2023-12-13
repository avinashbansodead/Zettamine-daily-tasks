package com.day4.bank_transaction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Account
{
    protected int accountNumber;
    protected Customer customerObj;
    protected double balance;

    
    public abstract boolean withdraw(double amount);
}


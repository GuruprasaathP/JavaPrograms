package com.java.practice.pro.Day13;

public class BankAccount {
    public String accountNumber;
    private double balance;
    
    public BankAccount(String accountNumber , double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public String getAccountNumber()
    {
        return accountNumber;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setDeposit (double amount)
    {
        if(amount > 0)
        {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        }
        else
        {
            System.out.println("Invalid deposit amount!");
        }
    }
    // setter method for withdrawing money(with validation
    public void setwithdraw(double amount)
    {
        if(amount > 0 && amount<= balance)
        {
            balance = balance-amount;
            System.out.println("withdrawn : " + amount);
        }
        else{
            System.out.println("invalid withdrawl amount!");
        }
    }

}

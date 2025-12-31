package com.java.practice.pro.Day13;

public class BankAccountApp {
    public static void main(String[] args) {


        BankAccount obj = new BankAccount("CNB1289900", 100000.00);
        System.out.println("Account number : " + obj.getAccountNumber());
        System.out.println("initial balance : " + obj.getBalance());
        obj.setDeposit(1000.00);
        System.out.println("Set Balance : " + obj.getBalance() );
        obj.setwithdraw(1000.00);
        System.out.println(obj.getBalance());
    }
}

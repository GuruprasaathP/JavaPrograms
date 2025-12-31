package com.java.practice.pro.Day12;

public class Bank {

    String Account_holder = "";
    String Account_Number = "";
    double balance = 0;

     Bank(String Account_holder,String Account_Number)
    {
        this.Account_holder = Account_holder;
        this.Account_Number = Account_Number;
        System.out.println("Account_holder Name is : " + Account_holder);
        System.out.println("Account_Number  is : " + Account_Number);
    }
    void Deposit(double amount)
    {
        this.balance = balance + amount;
        System.out.println( "The total balance is : " + balance);

    }

    void Withdraw(double amount)
    {
        if(amount>=0 && balance >= amount)
        {
            balance = balance - amount;
            System.out.println("The cash withdraw amount is : " + amount);
            System.out.println("The remaining balance is : " + balance);
        }

        else
        {
            System.out.println("Balance is not efficient ! ");
        }
    }
//    void display(){
//        System.out.println("The remaining balance is : " + balance);
//    }


    public static void main(String[] args) {
        Bank obj = new Bank("guru","706CNB1000234");
        obj.Deposit(40);
        obj.Withdraw(1000);
      //  obj.display();

    }
}

package com.java.practice.pro.Day20;

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Account Number : ");
        String EB_Account_Number = input.nextLine();

        System.out.println("Enter the Customer First Name : ");
        String CustomerFirstName = input.nextLine();

        System.out.println("Enter the Customer Last Name : ");
        String CustomerLastName = input.nextLine();

        System.out.println("Enter the Account Type (Residential/Commercial) : ");
        String AccountType = input.nextLine();

        int TotalBillAmount=0;

        int TotalUnitUseFirstName = CustomerFirstName.length();  // formula for unit
        int Total_Unit = (int) ((TotalUnitUseFirstName)/2.7*100);
        System.out.println("Total Unit Consumed : " + Total_Unit);


        /*if(EB_Account_Number.endsWith("77") || EB_Account_Number.endsWith("88")  ){

            System.out.println("Invalid");


        }*/

     if(AccountType.equalsIgnoreCase("Residential")) {
         if (EB_Account_Number.endsWith("77")) {
             if (Total_Unit <= 100) {
                 TotalBillAmount = 0;
                 System.out.println("Nill Bill Amount. ");

             } else if (Total_Unit >= 101 && Total_Unit <= 200) {
                 TotalBillAmount = (Total_Unit) * 4;

             } else if (Total_Unit > 200) {
                 TotalBillAmount = (int) (200 * 4 + ((Total_Unit - 200) * 4.5));
             }

             System.out.println("The residential bill amount is : " + TotalBillAmount);
         }
     }
        if(AccountType.equalsIgnoreCase("Commercial")) {
            if (EB_Account_Number.endsWith("88")) {
                TotalBillAmount = Total_Unit  * 10;
                System.out.println("The Commercial bill amount is : " + TotalBillAmount);
            }
        }

    }
}

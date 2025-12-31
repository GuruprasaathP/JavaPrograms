package com.java.practice.pro.Day7;

import java.util.Scanner;

public class IncomeTaxCalculator {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter your Earning: ");
            double income = scan.nextDouble();

            double tax = 0;

            if (income<=250000)
            {
                tax = 0;
                System.out.println("Nill Tax");
            }
            else if (income<=500000)
            {
                tax = (income-250000) * 0.05;

            }
            else if (income<=1000000)
            {
                tax = (250000*0.05)+(income-500000) * 0.20;
            }
            else
            {
                tax = (250000*0.05)+(500000*0.20)+(income-1000000) * 0.30;
            }

            System.out.println("your Tax is : " + tax);
        }
}

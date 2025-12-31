package com.java.practice.pro.Day1;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Formula for Celsius

        System.out.println("Enter the Fahrenheit : ");
        int Fahrenheit = input.nextInt();
        int Celsius = (Fahrenheit - 32) * 5 / 9 ;

        System.out.println(Celsius);

        // Formula for Celsius

        System.out.println("Enter the Celsius  : ");
         Celsius = input.nextInt();
        Fahrenheit = (Celsius * 9 / 5) + 32 ;
        System.out.println(Fahrenheit);


    }
}

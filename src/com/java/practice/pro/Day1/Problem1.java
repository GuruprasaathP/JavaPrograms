package com.java.practice.pro.Day1;

import java.util.Scanner;
/// string,int,double,char,boolean
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String Name = sc.nextLine();
        int Age = sc.nextInt();
        double Height = sc.nextDouble();
        char Initial = sc.next().charAt(0);
        boolean Student;
        System.out.println("Enter the Name   : " + Name);
        System.out.println("Enter the Age    : " + Age);
        System.out.println("Enter the Height : " + Height);
        System.out.println("Enter the Intial   : " + Initial );

    }
}

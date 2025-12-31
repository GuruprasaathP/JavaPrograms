package com.java.practice.pro.Day1;

import java.util.Scanner;

// greatest among the three number
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bowl;
        System.out.println("Enter the First number : " );
        int a = sc.nextInt();
        System.out.println("Enter the Second number : " );
        int b = sc.nextInt();
        System.out.println("Enter the Third number : " );
        int c = sc.nextInt();
// in this logic we have to used to take one empty bowl
// and assign one value to the bowl
// and compared the bowl with the remaining value
// and print the bowl

        bowl = a;

        if(b>bowl)
        {
            bowl = b;
        }
        if(c>bowl)
        {
           // System.out.println("c is big "+ c);
            bowl = c;
        }

            System.out.println("The Greatest Number is : " + bowl);
    }
}

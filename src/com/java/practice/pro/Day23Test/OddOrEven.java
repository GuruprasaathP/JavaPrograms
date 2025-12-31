package com.java.practice.pro.Day23Test;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = input.nextInt();

        String check = (num % 2 == 0 ? "The Number is Even " + num : "The Number is Odd : " + num);
        System.out.println(check);


    }

}

package com.java.practice.pro.Day23Test;

import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = input.nextLine();

        // Convert string to character array
        char[] chars = name.toCharArray();
        String reverse = "";

        for (char ch : chars) {
           reverse = ch + reverse;
        }
        System.out.println(reverse);
    }
}

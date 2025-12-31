package com.java.practice.pro.Day5;

// Regular Expression program

public class Regex
{
    public static void main(String[] args) {
        String input = "guru123";

        if (input.matches("[a-zA-Z]+\\d+")) {
            System.out.println("Valid: letters + digits");
        } else {
            System.out.println("Invalid format");
        }
    }

}

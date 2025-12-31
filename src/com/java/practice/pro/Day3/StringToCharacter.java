package com.java.practice.pro.Day3;

public class StringToCharacter {
    public static void main(String[] args) {
        String name = "guru";

        char[] chars = name.toCharArray();  // Convert to char array

        for (char c : chars) {
            System.out.println(c);  // prints each character
        }

    }
}

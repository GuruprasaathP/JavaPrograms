package com.java.practice.pro.Day23Test;

import java.util.Scanner;

public class VowelOrConstant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = input.nextLine().toLowerCase();

        String result = ( "aeiou".contains(letter)) ? "Vowel" : "Consonant";
        System.out.println(result);
    }
}

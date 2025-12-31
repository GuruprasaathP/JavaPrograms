package com.java.practice.pro.Day2;

public class StringMethodsPart4 {
    public static void main(String[] args) {
        String S1 = " Guruprasaath";
        String S2 = " Guruprasaath";

        System.out.println(S1.compareTo(S2));    // Lexicographical comparison
        System.out.println(S1.endsWith("th"));    // Check if ends with 't'
        System.out.println(S1.startsWith(" Guru")); // Check if starts with " Guru"
    }
}

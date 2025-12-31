package com.java.practice.pro.Day2;

public class StringMethods {
    public static void main(String[] args) {
        // String methods
        String S1 = " Guruprasaath";
        String S2 = " Guruprasaath";

        System.out.println(S1.concat(" vidhya"));
        System.out.println(S1.equals(S2));
        System.out.println(S1.equalsIgnoreCase(S2));

        System.out.println(S1.toLowerCase());
        System.out.println(S1.toUpperCase());
        System.out.println(S1.trim());
        System.out.println(S1.contains("Guru"));
        System.out.println(S1.compareTo(S2));
        System.out.println(S1.endsWith("t"));
        System.out.println(S1.startsWith(" Guru"));
        System.out.println(S1.lastIndexOf("a"));
        System.out.println(S1.indexOf("a"));
    }
}








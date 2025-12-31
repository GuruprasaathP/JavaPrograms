package com.java.practice.pro.Day3;

public class IntergerToCharacter {
    public static void main(String[] args) {
        String a = "guruprasaath";
        int b = 1234;

        for (int i = 0; i < a.length(); i++)
        {

            System.out.println(a.charAt(i));

        }
        System.out.println();

        // convert the Integer to string

        String str = String.valueOf(b);

        // using for each loop to convert the string into a character with the help of toCharArray method

        for( char digit : str.toCharArray())
        {
            System.out.println(digit);
        }
    }
}

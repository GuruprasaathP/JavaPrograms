package com.java.practice.pro.Day3;

public class NumToReverse {
    public static void main(String[] args) {
        int number = 359;
        //int rev = 0;


        while (number != 0)
        {
            int rev = number % 10;
            //System.out.println(rev); // give the last digit
            number = number/10 ;   // with out last digit
            System.out.println(rev);
        }
        // System.out.println(rev);

    }
}

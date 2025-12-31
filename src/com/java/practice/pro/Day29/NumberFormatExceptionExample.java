package com.java.practice.pro.Day29;

public class NumberFormatExceptionExample {

    public static void main(String[] args) {

        try{
            String invalidNumber = "abc";
            int num = Integer.parseInt(invalidNumber);
        } catch (NumberFormatException e){
            System.out.println("NumberFormatException caught : " + e.getMessage());
        }
    }
}

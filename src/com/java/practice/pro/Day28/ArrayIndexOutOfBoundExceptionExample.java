package com.java.practice.pro.Day28;

// single try multi catch cannot work in java because it only execute the first exception only

public class ArrayIndexOutOfBoundExceptionExample {
    public static void main(String[] args) {


        try {
            int[] number = {1, 2, 3};
            System.out.println(number[5]);
            int a = 20;
            int b = a/0;
            System.out.println(b);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundException caught : " + e.getMessage());
            //e.printStackTrace();
        }
         catch (ArithmeticException e ){
            System.out.println("arithmetic exception.."+ e.getMessage());
             e.printStackTrace();
        }
    }
}

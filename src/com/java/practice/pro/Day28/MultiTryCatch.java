package com.java.practice.pro.Day28;

// in this is a multi try and multi catch..........

public class MultiTryCatch {
        public static void main(String[] args) {

            try {
                int[] number = {1, 2, 3};
                try {
                    System.out.println(number[5]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("ArrayIndexOutOfBoundException caught: " + e.getMessage());
                }

                try {
                    int a = 20;
                    int b = a / 0;
                    System.out.println(b);
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic exception: " + e.getMessage());
                }

            } catch (Exception e) {
                System.out.println("General exception: " + e.getMessage());
            }
        }
}

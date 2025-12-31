package com.java.practice.pro.Day3;

import java.util.Scanner;

public class IntegerToCharUseArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[3];

        for (int i = 0; i <= array.length-1; i++) {
            array[i] = input.nextInt();
        }

        String str = String.valueOf(array);

        for (int num : str.toCharArray()) {
            System.out.println(num);
        }
    }
}
package com.java.practice.pro.Day4;

import java.util.Scanner;

public class ArrayUseFor {
    public static void main(String[] args) {
        int array [] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<= array.length-1;i++){
            array[i] =sc.nextInt();
        }
        for(int i =0;i<= array.length-1;i++){
            System.out.println(array[i]);
        }

    }
}

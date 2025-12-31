package com.java.practice.pro.Day4;

import java.util.Scanner;
///  array pro  for loop using to get the input and For Each Loop used to get  the output
public class ArrayUseForEach {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
///  to initialize an array
        String [] array = new String[5];

        System.out.println("Enter the 5 name : ");
/// for loop
        for(int i =0;i<= array.length-1;i++)
        {
            array[i] = sc.nextLine();
        }
/// for each loop
        for(String name : array)
        {
            System.out.println(name);
        }
    }
}

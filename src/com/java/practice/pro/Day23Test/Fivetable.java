package com.java.practice.pro.Day23Test;

import java.util.Scanner;

public class Fivetable {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter the Table Number : ");
        int table = input.nextInt();
        for(int a=1;a<=10;a++){
            System.out.println(a + "*" + table + "=" + a*table);
        }
    }
}

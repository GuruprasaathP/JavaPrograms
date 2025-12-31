package com.java.practice.pro.Day12;

public class StarLeftDiagonal {
    public static void main(String[] args) {
        int space = 5;
        int row = 5;
        for(int i =row;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                System.out.print("-");
            }
            System.out.println(" *");


        }
    }
}

package com.java.practice.pro.Day12;

public class StarRightDiagonal {

    public static void main(String[] args) {

        int row = 5;
        int space = 3;

        for (int i = 0; i <= row; i++)
        {
          for(int j=i;j<=i*space;j++)
          {
              System.out.print(" ");
          }
            System.out.println("*");
        }
    }
}

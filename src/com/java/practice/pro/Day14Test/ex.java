package com.java.practice.pro.Day14Test;

public class ex {

        public static void main(String[] args) {
            int temp = 0 ;
            int num =4618;
            while(num!=0)
            {
                temp = num % 10 ;
                num = num / 10;

                 System.out.println(temp);
            }
           // System.out.println(temp);
        }
    }

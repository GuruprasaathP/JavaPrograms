package com.java.practice.pro.Day21;



public class Polymor_Overloading {

    int  add(int a, int b) {
        return a+b;
    }
    int add(int a,int b,int c) {
        return a+b+c;
    }
    double add(double a,double b,double c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Polymor_Overloading obj = new Polymor_Overloading();
        int a =obj.add(1,2);
        int b =obj.add(1,2,3);
        double c = obj.add(1, 3, 4);
        System.out.println("sum of two integer : " + a);
        System.out.println("sum of three integer : " + b);
        System.out.println("sum of three integer : " + c);
    }


}

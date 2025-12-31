package com.java.practice.pro.Day25;

// in this call by value it can be used to point the reference only

public class CallByValue {

    public static  void modifyValue(int a){
        a = 10;
        System.out.println("A value in modify value method : " + a);
    }
    public static void main(String[] args) {

        // in this call by value it can be used to point the reference only  for example the reference of 'a' is only moved to the callByMethod

        int a = 5;
        modifyValue(a);
        System.out.println("A Value in main method : " + a);
    }
}

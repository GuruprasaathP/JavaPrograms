package com.java.practice.pro.Day9;
// in this method if you can use the use the static
public class MethodUse {

    public static int add() {
        int a = 20;
        int b = 50;
        int c = a+b;
        return c;
   }


    public static void main(String[] args) {
        MethodUse obj1 = new MethodUse();
       // int result = obj1.add();
        //System.out.println(result);
        System.out.println(obj1.add());


    }
}


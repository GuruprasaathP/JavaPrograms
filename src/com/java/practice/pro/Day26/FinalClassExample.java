package com.java.practice.pro.Day26;

// final using class level ...

final class FinalClass{
    void disp(){
        System.out.println("This is a final class ...");
    }
}
 /*
 class Child extends FinalClass  // this is a child class in this class we can not extend parent
                                 // because parent is declared as a final class
 {

 }
 */

public class FinalClassExample {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.disp();
    }
}

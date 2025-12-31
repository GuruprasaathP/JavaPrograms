package com.java.practice.pro.Day26;


import java.util.HashMap;
import java.util.Objects;

class parent{

    final void showMethod()
    {
        System.out.println("This is the final method ...");
    }

}

class Child extends parent{

    /*void showMethod(){
        System.out.println("fbu uehdu"); // this method can not override because we can declare the parent class this method is final
                                         // so we can not override....
    }*/

}


public class FinalMethodExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.showMethod();
    }
}

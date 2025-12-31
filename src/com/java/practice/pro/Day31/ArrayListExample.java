package com.java.practice.pro.Day31;
// it allows dulicates
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cheery");
        fruits.add("Apple");
        System.out.println("The list of Fruits : " + fruits);

        fruits.add(1,"Orange");
        System.out.println("After the insection : " + fruits);

        fruits.remove(2);
        {
            System.out.println("After removal : " + fruits);
        }
        Collections.sort(fruits);
        System.out.println("Äfter the sorting the Fruits in alphabets : " + fruits);
    }
}

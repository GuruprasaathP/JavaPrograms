package com.java.practice.pro.Day38;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Emma");
        names.add("Olivia");
        names.add("Sophia");
        names.add("Emma");
        System.out.println("Name (Sorted order): " + names);

        names.add("Ava");
        System.out.println("After adding Ava : "+ names);

        System.out.println("First Element : " + names.first());
        System.out.println("Last Element : " + names.last());

        System.out.println("Iterating over set : ");

        Iterator<String> i = names.descendingIterator();  // in this can be used to convert in the desending order

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}

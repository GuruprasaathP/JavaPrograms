package com.java.practice.pro.Day31;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Deepak");
        names.add("john");
        names.add("Suganthan");

        System.out.println("Name: "+ names);
        names.addFirst("Alice");
        System.out.println("After adding the first name :" +names);

        names.removeLast();
        System.out.println("After removing the last : "+names);

        names.remove(1);
        System.out.println("After removing the first index : " + names);

        Collections.replaceAll(names,"john","Guru");
        System.out.println("After the replace of john : " + names);


    }
}

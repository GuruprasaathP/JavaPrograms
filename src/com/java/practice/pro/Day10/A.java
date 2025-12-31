package com.java.practice.pro.Day10;

import java.util.ArrayList;
import java.util.List;

public class A {


    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("Java");

// list.add(100); // ❌ Compile-time error

        String lang = list.get(1); // ✅ No cast needed

        System.out.println(lang);

    }
}
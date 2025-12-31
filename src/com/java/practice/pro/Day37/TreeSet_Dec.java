package com.java.practice.pro.Day37;
// How to create a TreeSet in descending order.
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TreeSet_Dec {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(21,2,5,6,9,5);
        TreeSet<Integer> seen = new TreeSet<>(list);
        System.out.println(seen);

    }
}

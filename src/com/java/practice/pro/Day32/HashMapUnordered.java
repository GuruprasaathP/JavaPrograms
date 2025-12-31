package com.java.practice.pro.Day32;

import java.util.HashMap;

public class HashMapUnordered {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(50, "John");
        students.put(2, "Emma");
        students.put(99, "Sophia");
        students.put(17, "Mike");
        students.put(75, "Deepak");
        students.put(null, "No ID");
        students.put(105, null);

        System.out.println("All Students:");
        for (Integer id : students.keySet()) {
            System.out.println("ID : " + id + "  Name : " + students.get(id));
        }
    }
}

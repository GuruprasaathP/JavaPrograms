package com.java.practice.pro.Day32;

import java.util.HashMap;
// key unique ...not thread safe ...key & value pair ...ordered...
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> Students = new HashMap<>();
        Students.put(null,"nooID");
        Students.put(100,"john");
        Students.put(12,"Emma");
        Students.put(105,null);
        Students.put(349,"deepak");
        Students.put(null,"NO ID");
        Students.put(null,"NO No ID");// nul gives the first priority index 0 so it is
        Students.put(104,"guru");

        System.out.println("Student with ID 101 : "+ Students.get(101));

        System.out.println("All Students :");
        for(Integer id : Students.keySet()){
            System.out.println( "   ID : " + id + "  Name :"+ Students.get(id)+"\n");

        }
    }
}

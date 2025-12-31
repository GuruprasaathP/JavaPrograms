package com.java.practice.pro.Day33;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {



    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> employeeSalaries = new ConcurrentHashMap<>();

        employeeSalaries.put("Jonh", 50000);
        employeeSalaries.put("Emma",70000);
        employeeSalaries.put("sophia",60000);
        System.out.println("Employee salary  :");

        employeeSalaries.forEach((name ,salary)->
                        System.out.println("Name: "+ name +", salary: $ "+ salary)
                );


    }
}

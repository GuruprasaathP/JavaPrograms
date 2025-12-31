package com.java.practice.pro.Day28;

// it is the null pointer exception so it shows the null pointer exception..........

public class Exceptionhandling_NullPointer {
    public static void main(String[] args) {
        try{
            String name = null;
            System.out.println(name.length());
        }
        catch(NullPointerException e){
            System.out.println("SHOW THE NULL POINTER EXCEPTION... " + e.getMessage());
        }
    }
}

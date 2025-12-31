package com.java.practice.pro.Day29;

public class IllegalArgumentExceptionExample {

    public static void main(String[] args) {

        try{
            setAge(-5);
        } catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException caught : " + e.getMessage());
        }
    }
    static void setAge(int age){
        if(age <  0){
            throw new IllegalArgumentException("Age can not be negative ");
        }
    }
}

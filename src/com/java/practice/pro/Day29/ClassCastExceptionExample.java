package com.java.practice.pro.Day29;
// in this program
public class ClassCastExceptionExample {
    public static void main(String[] args) {
        try{
            // Object String in this string can not converted to integer
            Object obj = new String("Hello");
            Integer num = (Integer) obj;
        } catch (ClassCastException e){
            System.out.println("ClassCastException caught : " + e.getMessage());
        }
    }
}

package com.java.practice.pro.Day29;

public class MultiExceptionExample {

    public static void main(String[] args) {
        try{
            int[] arr = new int[5];
            arr[10] = 50;   // array IndexOutOfBoundsException
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error : Array index out of bounds ");
        } catch (Exception e){
            System.out.println("General exception ");
        }
    }
}

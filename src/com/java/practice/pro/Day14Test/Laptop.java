package com.java.practice.pro.Day14Test;

public class Laptop {
    String brand;
    int ramSize;
    String processor;

void  display_Laptop()
 {
     System.out.println( "The name of the brand is : " + brand);
     System.out.println("The ram size is : " + ramSize);
     System.out.println("The name of the Processor is  : " + processor);
     System.out.println();
   }


    public static void main(String[] args) {
        Laptop Guru = new Laptop();

        Guru.processor ="intel";
        Guru.ramSize = 16;
        Guru.brand = "Dell";


        Laptop Deepak = new Laptop();

        Deepak.processor ="Ryzen";
        Deepak.ramSize = 12;
        Deepak.brand = "Asus";

       // System.out.println();
        Guru.display_Laptop();
        Deepak.display_Laptop();

    }
}

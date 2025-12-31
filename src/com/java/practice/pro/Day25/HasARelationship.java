package com.java.practice.pro.Day25;

// has a relationship class example program....

 class car{
     void start(){
         System.out.println("engin has started...");
     }
 }
 class engin extends car {
     void start(){
         //  one new concept i create an object for class car with in this child class /// new concept
         car obj = new car();
         obj.start();

         System.out.println("car is ready to drive....");

     }

 }


public class HasARelationship {
    public static void main(String[] args) {

        engin eng = new engin();
        eng.start();

    }


}

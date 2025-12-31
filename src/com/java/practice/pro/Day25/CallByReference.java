package com.java.practice.pro.Day25;


class Bike{
    String Colour;
}



public class CallByReference {
    public static void main(String[] args) {

        Bike bike1 = new Bike();
        bike1.Colour= "red";

        Bike bike2 = bike1;
        bike2.Colour="Green";

        Bike bike3 = bike2;
        bike3.Colour = "yellow";

// in this without creating a new object we can assign change a value for the variable present in the method Bike

        System.out.println(bike1.Colour);
    }
}

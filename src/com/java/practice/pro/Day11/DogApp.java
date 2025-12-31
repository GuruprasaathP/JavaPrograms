package com.java.practice.pro.Day11;

public class DogApp {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
       // dog1.setBreed("Bull dog");
        dog1.setColour("light greay");
        dog1.setSize("large");
        dog1.setAge(5);

        System.out.println(dog1.getAge());
    }
}

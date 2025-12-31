package com.java.practice.pro.Day19;

// multiple inheritance

interface Flyable{
    void fly();
}
interface Swimmable {
    void swim();
}
class Bird implements Flyable,Swimmable{
    @Override
    public void fly() {
        System.out.println("bee is flying");
    }

    @Override
    public void swim() {
        System.out.println("bee is swim");

    }
}

public class Multiple {
    public static void main(String[] args) {
        Bird obj = new Bird();
        obj.fly();
        obj.swim();
    }
}

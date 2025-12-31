package com.java.practice.pro.Day15;

// has a relationship

class Engine
{
    void start()
    {
        System.out.println("Engine is started.");
    }

}

class Car
{
    Engine engine = new Engine();
    void drive()
    {
        engine.start();
        System.out.println("Car has started.");
    }

}


public class Main {
    public static void main(String[] args) {
     Car obj = new Car();
     obj.drive();
    }
}

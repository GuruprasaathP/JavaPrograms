package com.java.practice.pro;

interface interfaceName {

    void bike(); // `abstract` is optional here

    // Default method (Java 8+)
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // Static method (Java 8+)
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    int SPEED = 100; // public static final by default
}

class Car implements interfaceName {
    @Override
    public void bike() {
        System.out.println("Car running at speed: " + SPEED);
    }
}

public class Main {
    public static void main(String[] args) {
        Car obj1 = new Car();
        obj1.bike();             // Calls overridden method
        obj1.defaultMethod();    // Calls default method from interface

        // You can call static method from interface like this:
        interfaceName.staticMethod();
    }
}

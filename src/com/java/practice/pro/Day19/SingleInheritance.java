package com.java.practice.pro.Day19;

// Single inheritance

class Animal
{
    void eat(){
        System.out.println("This animal eat food.");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("The dog barks.");
    }
}


public class SingleInheritance {
    public static void main(String[] args) {


        Dog obj = new Dog();
        obj.eat();
        obj.bark();

    }

}

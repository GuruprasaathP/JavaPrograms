package com.java.practice.pro.Day15;

abstract class Animal {

    abstract void Sound();//  it is a abstract method so it can be accesed only in sub_class // we can not create object//but we can use to declare the variable // it must contain block { }

    void eat() {
        System.out.println("the animal can eat food.");
    }
}


class Dog extends Animal {
    @Override
    void Sound() {
        System.out.println("woof woof");
    }


    @Override
    void eat() {
        System.out.println("the animal can eat food.");
    }

}

public class AbstractApp {
    public static void main(String[] args) {


        Dog obj = new Dog();
        obj.Sound();
        obj.eat();


    }
}


package com.java.practice.pro.Day21;

import com.java.practice.pro.Day9.p1.A;

class Animal {
    void sound(){
        System.out.println("Animal make a sound .");
    }
}

class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog make sound weep .");
    }
}
class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("cat make a sound .");
    }
}

public class Forest {
    public static void main(String[] args) {
      Animal myanimal = new Animal();
      Dog mydog = new Dog();
      Cat mycat = new Cat();
      myanimal.sound();
      mycat.sound();
      mydog.sound();

    }
}



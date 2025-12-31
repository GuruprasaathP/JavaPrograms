package com.java.practice.pro.Day27;

import java.util.Objects;

class Person implements Cloneable {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


    public class ObjectClassExample {
        public static void main(String[] args) throws CloneNotSupportedException {
            Person obj = new Person("guru",24);
            Person obj1 = (Person)obj.clone();

    }
}


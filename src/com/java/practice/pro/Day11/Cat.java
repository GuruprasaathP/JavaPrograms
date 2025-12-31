package com.java.practice.pro.Day11;

 class Cat {

     int age;
    String Colour;
    String Types;

 // getter using

     int getage() {
        return age;
    }
// setter using
     void setAge(int age) {
       this.age = age;
    }

     @Override
     public String toString() {
         return "Cat{" +
                 "age=" + age +
                 ", Colour='" + Colour + '\'' +
                 ", Types='" + Types + '\'' +
                 '}';
     }
 }

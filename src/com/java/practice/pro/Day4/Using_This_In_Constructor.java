package com.java.practice.pro.Day4;
class con
{
        String name = "Deepak";

        con(String name) {
           // this.name = name; this.name use panna main class la obj create panni pass pandra name global la assign agum
            name = name;
            System.out.println(name);
        }

     void display() {
         System.out.println(name);
     }

    }
public class Using_This_In_Constructor {
    public static void main(String[] args) {
        con obj = new con("Arun");
        obj.display();
    }
}



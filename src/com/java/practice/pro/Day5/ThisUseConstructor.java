package com.java.practice.pro.Day5;

/*  Constructors can be created with or without arguments.
        → Example: Main() and Main(String a)
You can overload (reuse) constructors with different number or type of arguments.
        → Example: Main(String) and Main(String, int) are valid.
You cannot create two constructors with same type and number of arguments, even if names are different.
→ ❌ Main(String a) and Main(String b) → Not allowed  */

public class ThisUseConstructor {

    String a;
    String b;
    String c;

    ThisUseConstructor(String a, String b)
    {
        this.a = a;
        this.b = b;
        System.out.println("Constructor 2: " + a + " " + b);
    }
    // Constructor with 1 String
    ThisUseConstructor(String a)
    {
        this.a = a;
        System.out.println("Constructor 1: " + a);
    }

    ThisUseConstructor(String a, String b, String c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Constructor 3: " + a + " " + b + " " + c);
    }

    // Constructor with 2 Strings (different from above)
    void display()
    {
        System.out.println("Constructor: " + a + " " + b + " " + c);
    }



    public static void main(String args[] )
    {

        ThisUseConstructor obj1 = new ThisUseConstructor("Deepak");              // calls 1-arg constructor
        ThisUseConstructor obj2 = new ThisUseConstructor("Guru", "Hji");
        // calls 2-arg constructor
        ThisUseConstructor obj3 = new ThisUseConstructor("Gu", "raj","tan");
        obj1.display();
        obj2.display();
        obj3.display();


    }
}

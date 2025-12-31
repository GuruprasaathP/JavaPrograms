package com.java.practice.pro.Day31;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> book = new Stack<>();
        book.push("java programming");  // push is used to add the element
        book.push("C programming");
        book.push("C++ programming");
        System.out.println(" Books " + book);

        book.pop();   // it can remove the top most element
        System.out.println(" After the pop operation : " + book);

       // book.peek();  // it can give the top most element
        System.out.println(" The peek can be showed : " +book.peek());

    }
}

package com.java.practice.pro;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        // Retrieving the head
        System.out.println("The item in the Queue are : " + queue);
        System.out.println("Head of the Queue : "+queue.peek());

        System.out.println("Removed : "+queue.poll());
        System.out.println("Removed : "+queue.poll());

        System.out.println("Remaining queue : " + queue);

    }
}

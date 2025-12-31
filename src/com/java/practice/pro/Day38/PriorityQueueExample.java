package com.java.practice.pro.Day38;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(1);
        pq.add(2);

        System.out.println("PriorityQueue : " + pq); // 1,5,20,10

        System.out.println("Peek : "+ pq.peek()); // 1

        while(!pq.isEmpty())
        {
            System.out.println("Poll: "+pq.poll());
        }
        
    }
}

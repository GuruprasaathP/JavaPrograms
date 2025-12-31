package com.java.practice.pro.Day5;

public class ControlStatementsExample {
    public static void main(String[] args) {
        int number = 10;

        // if-else condition
        if (number > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }

        // Looping: for loop
        System.out.println("Numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Decision-Making: switch
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Well done");
                break;
            default:
                System.out.println("Keep trying");
        }

        // Looping: while loop
        System.out.println("Count from 5:");
        int count = 5;
        while (count > 0) {
            System.out.println(count);
            count--;
        }

        // Jump Statement: continue
        System.out.println("Skipping number 3:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3){
                continue;
            }
            System.out.println(i);
        }

        // Jump Statement: break
        System.out.println("Breaking at number 4:");
        for (int i = 1; i <= 5; i++) {
            if (i == 4)
                break;
            System.out.println(i);
        }

        // Jump Statement: return
        System.out.println("Returning at number 2:");
        for (int i = 1; i <= 5; i++) {
            if (i == 2)
                return;
            System.out.println(i);
        }

        System.out.println("End of the code");
    }
}

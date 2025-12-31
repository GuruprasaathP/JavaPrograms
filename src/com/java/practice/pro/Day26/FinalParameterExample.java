package com.java.practice.pro.Day26;

// final keyword used in the parameter level

public class FinalParameterExample {

    void display(final int num ){

        System.out.println("Value of the num : " + num);

        //num = num +1;  // in this parameter we can declared the num as the final so we can not assign the value after
    }

    public static void main(String[] args) {

        FinalParameterExample exa = new FinalParameterExample();
        exa.display(100);
    }
}

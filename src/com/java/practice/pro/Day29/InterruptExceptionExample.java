package com.java.practice.pro.Day29;

public class InterruptExceptionExample {

    public static void main(String[] args)  throws  InterruptedException{
        Thread thread = new Thread(() ->{

            try{
                System.out.println("Thread going to sleep for 5 sec");
                Thread.sleep(5000);
            }
            catch (InterruptedException e){
                System.out.println("InterruptedException caught : " + e.getMessage());
            }

        });
        thread.start();
        Thread.sleep(8000);
        thread.interrupt();
        System.out.println("Succesfully interrupted :) ");

    }
}

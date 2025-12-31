package com.java.practice.pro.Day28;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {

        try{
            FileReader file = new FileReader("missingfile.txt");
            System.out.println(file);

        }
        catch (FileNotFoundException e){
            System.out.println("FileNotfoundEDxception caught : " + e.getMessage());
        }
    }
}

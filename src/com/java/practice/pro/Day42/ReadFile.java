package com.java.practice.pro.Day42;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File read = new File("myfile3242.txt");
        try {
            if (read.exists() && read.canRead() && read.length() > 0) {
                Scanner Reader = new Scanner(read);
                while (Reader.hasNextLine()) {
                    String data = Reader.nextLine();
                    System.out.println(data);
                }
                Reader.close();
            }
            else{
                System.out.println("File is not found or corrupt or missing");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
package com.java.practice.pro.Day42;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile
{
    public static void main(String[] args)
    {
// Writing Text File
        try {

            FileWriter Writer = new FileWriter("C:\\Users\\dell lap\\OneDrive\\Desktop\\myfile2.txt",true);

// Writing File
            Writer.write("\n hai i can achieve it ");
            Writer.close();

            System.out.println("Successfully written.");
        }

// Exception Thrown
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
package com.java.practice.pro.Day43;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamExample {

    public static void main(String[] args) {

        try {
            // Step 1: Open the input file (source image)

            FileInputStream fis = new FileInputStream("dhoni.jpg");

            // Step 2: Open the output file (destination image)
            FileOutputStream fos = new FileOutputStream("copy.jpg");

            int data;

            // Step 3: Read and write byte by byte

            while ((data = fis.read()) != -1) {

                fos.write(data);

            }
            // Step 4: Close the streams
            fis.close();
            fos.close();
            System.out.println("Image copied successfully");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}

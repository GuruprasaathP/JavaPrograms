package com.java.practice.pro.Day43;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStream1 {


        public static void main(String[] args) {

            try {
                // Step 1: Open the input file (source image)

                FileInputStream fis = new FileInputStream("dhoni.jpg");
                BufferedInputStream obj = new BufferedInputStream(fis);

                // Step 2: Open the output file (destination image)
                FileOutputStream fos = new FileOutputStream("copy.jpg");
                BufferedOutputStream obj1 = new BufferedOutputStream(fos);

                int data;

                // Step 3: Read and write byte by byte

                while ((data = obj.read()) != -1) {

                    obj1.write(data);

                }
                // Step 4: Close the streams
                obj.close();
                obj1.close();
                System.out.println("Image copied successfully");

            } catch (Exception e) {

                e.printStackTrace();
            }
        }


}

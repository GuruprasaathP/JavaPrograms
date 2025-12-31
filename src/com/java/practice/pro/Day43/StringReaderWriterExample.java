package com.java.practice.pro.Day43;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;

public class StringReaderWriterExample {
    public static void main(String[] args) {

        // Step 1: Input string (like user input)
        String input = "Hello, Java Streams!";

        try {
            // Step 2: Create StringReader to read the input string
            StringReader reader = new StringReader(input);

            // Step 3: Create StringWriter to store the processed string
            StringWriter writer = new StringWriter();

            int ch;

            // Step 4: Read each character, process it, and write to StringWriter
            while ((ch = reader.read()) != -1) {
                // Example processing: convert lowercase letters to uppercase
                writer.write(Character.toUpperCase(ch));
            }

            // Step 5: Close streams
            reader.close();
            writer.close();

            // Step 6: Get the final processed string from StringWriter
            String result = writer.toString();

            // Output
            System.out.println("Original String: " + input);
            System.out.println("Processed String: " + result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

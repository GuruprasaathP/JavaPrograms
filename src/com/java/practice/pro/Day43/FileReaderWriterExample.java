package com.java.practice.pro.Day43;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// character input stream
public class FileReaderWriterExample {
    public static void main(String[] args) throws IOException {
        // writing the file using the file writer
        try {
            FileWriter Writer = new FileWriter("file100.txt");
            Writer.write("Hello java in the file handling \n");
            Writer.write("FileReader Example ");
            Writer.close();

            // Reading from using the fileReader

            FileReader reader = new FileReader("file100.txt");
            int character;
            System.out.println("File content : ");
            while (((character = reader.read()) != -1)) {
                System.out.print((char) character);

            }
            System.out.println("---------------------------approach 2 scanner class--------------");
            Scanner Reader = new Scanner(new FileReader("file100.txt"));
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }

            Reader.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("Show the exception : "+ e );
        }
    }
}

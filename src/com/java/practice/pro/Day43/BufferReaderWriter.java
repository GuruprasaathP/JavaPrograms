package com.java.practice.pro.Day43;

import java.io.*;

public class BufferReaderWriter {
    public static void main(String[] args) throws IOException {
        // Writing the file using the filewriter
     try {
         FileWriter obj = new FileWriter("file100.txt",true);
         BufferedWriter bw = new BufferedWriter(obj);  // using the buffer writer

         bw.write("Java is a the popular programming language ");
         bw.newLine();
         bw.write("I LOVE Java");
         bw.close();

         // Readding the file using the Buffer reader
         FileReader obj1 = new FileReader("file100.txt");
         BufferedReader br = new BufferedReader(obj1);
         String line;

         System.out.println("file content : ");
         while((line = br.readLine())!=null){
             System.out.println(line);
         }
         br.close();
     }
     catch (IOException e){
         e.printStackTrace();
     }
    }
}

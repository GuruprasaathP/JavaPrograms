package com.java.practice.pro.Day43;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class NIOExample {
    public static void main(String[] args) throws IOException {
        Files.write(Paths.get("nio.txt"), "Hello NIO".getBytes());
        System.out.println("File written using NIO");
    }
}

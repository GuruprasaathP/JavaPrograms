package com.java.practice.pro.Day43;

import java.io.RandomAccessFile;

public class RandomAccessExample {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("file100.txt", "rw");
            file.seek(1); // Move pointer to 10th byte
            file.writeBytes("guru");
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

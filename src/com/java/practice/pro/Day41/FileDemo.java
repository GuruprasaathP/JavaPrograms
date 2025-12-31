
package com.java.practice.pro.Day41;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\dell lap\\OneDrive\\Desktop\\Taj.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File created");
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        System.out.println("File name : " + file.getName());
        System.out.println("File Size : " + file.length());
        System.out.println("File path : " + file.getPath());
        System.out.println("File Absolutepath : " + file.getAbsolutePath());
        System.out.println("File exists : " + file.exists());
        System.out.println("Is File : " + file.isFile());
        System.out.println("File Directory " + file.isDirectory());

       try {
           if (file.exists()) {
               file.delete();
               System.out.println("File is deleted ...");
           }
       }
       catch (Exception e){
           System.out.println("File is not found .."+ e);
       }
    }
}


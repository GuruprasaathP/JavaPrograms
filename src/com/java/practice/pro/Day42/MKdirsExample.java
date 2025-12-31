package com.java.practice.pro.Day42;
import java.io.File;
public class MKdirsExample {
        public static void main(String[] args) {
            File dir = new File("TestFolder");
            if (!dir.exists()) {
                dir.mkdir();
                System.out.println("Directory created");
            } else {
                System.out.println("Directory not created & already present");
            }

            // to make the multiple directory (Sub folders)
            dir = new File("java/Filehandling/directory");
            if(!dir.exists()){
                dir.mkdirs();
                System.out.println("Sub Directories Created");
            }
        }
}

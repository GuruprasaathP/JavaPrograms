package com.java.practice.pro.Day43;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateReadWrite {
    public static void main(String[] args) {

        File muldir = new File("C:/Users/dell lap/OneDrive/Desktop/Mahil/FileHandling/Content");

        try {
            if (!muldir.exists()) {
                muldir.mkdirs();
                System.out.println("Folder created...");

            } else {
                System.out.println("Already exist...");
            }

            FileWriter obj = new FileWriter("C:/Users/dell lap/OneDrive/Desktop/Mahil/FileHandling/Content/kolli_hills");
            obj.write("Kolli Hills (Kolli Malai) is a scenic hill station in Tamil Nadu's Namakkal district\nfamous for its dense forests, medicinal herbs, and adventurous hairpin bends, offering pristine nature,\ntrekking to waterfalls like Agaya Gangai, and cultural sites like Siddhar caves, attracting nature lovers and adventurers seeking untouched beauty away from commercial tourism.");
            obj.close();

            FileReader read = new FileReader("C:/Users/dell lap/OneDrive/Desktop/Mahil/FileHandling/Content/kolli_hills");
            Scanner ob = new Scanner(read);

            while(ob.hasNextLine()){
                String data = ob.nextLine();
                System.out.println(data);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}




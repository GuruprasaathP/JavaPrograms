package com.java.practice.pro.Day44;

/*Assignment:ner
Read data from CSV file and convert each record into an object and
        store them in ArrayList. Filter the records from ArrayList based on
below condition one by one :
Kilometers_Driven – 27000 to 78000
Fuel_Type – Only Petrol
Transmission – Manual
Owner_Type – Second Owner"*/

import java.io.*;
import java.util.ArrayList;

public class FilehandlingAssignment {
    public static void main(String[] args) {

        try {
            FileReader red = new FileReader("cars.csv");
            BufferedReader obj = new BufferedReader(red);
            ArrayList list = new ArrayList<>();
            String line;
            while ((line=obj.readLine())!=null){
               // System.out.println(line);
                list.add(line);
            }
            System.out.println(list);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}

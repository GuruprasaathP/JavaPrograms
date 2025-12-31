package com.java.practice.pro.Day44;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomDataGeneration{
    public static void main(String[] args) throws IOException {

        String[] carNames = {"Maruti Swift", "Hyundai i20", "Honda City", "Tata Nexon", "Volkswagen Polo",
                "Renault Kwid", "Ford EcoSport", "Mahindra XUV300", "Maruti Baleno",
                "Hyundai Creta", "Toyota Innova", "Skoda Rapid", "Honda Amaze",
                "Kia Seltos", "Maruti Celerio", "Tata Tiago", "Hyundai Verna",
                "Renault Duster", "Ford Figo", "Toyota Etios"};

        String[] fuelTypes = {"Petrol", "Diesel"};
        String[] sellerTypes = {"Dealer", "Individual"};
        String[] transmissions = {"Manual", "Automatic"};
        String[] ownerTypes = {"First Owner", "Second Owner", "Third Owner"};

        Random rand = new Random();

        try {
            FileWriter writer = new FileWriter("cars.csv");
            writer.write("Car_Name,Year,Selling_Price,Present_Price,Kilometers_Driven,Fuel_Type,Seller_Type,Transmission,Owner_Type\n");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of records generated: ");
            int count = sc.nextInt();

            while (count > 0) {


                String car = carNames[rand.nextInt(carNames.length)];
                int year = rand.nextInt(10) + 2013; // 2013 - 2022
                double sellingPrice = rand.nextInt(1500) / 100.0 + 3.0; // 3.0 - 17.0
                double presentPrice = sellingPrice + rand.nextInt(50) / 5.0; // selling + small increment
                int km = rand.nextInt(90000 - 20000) + 20000; // 20000 - 90000
                String fuel = fuelTypes[rand.nextInt(fuelTypes.length)];
                String seller = sellerTypes[rand.nextInt(sellerTypes.length)];
                String transmission = transmissions[rand.nextInt(transmissions.length)];
                String owner = ownerTypes[rand.nextInt(ownerTypes.length)];

                writer.write(car + "," + year + "," + sellingPrice + "," + presentPrice + "," +
                        km + "," + fuel + "," + seller + "," + transmission + "," + owner + "\n");

                count--;
            }

            writer.close();
            System.out.println("Random CSV Data Generated Successfully → cars.csv");

        } catch (IOException e) {
            System.out.println("Error while writing CSV!");
            e.printStackTrace();
        }

    }
}
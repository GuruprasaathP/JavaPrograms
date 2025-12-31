package com.java.practice.pro.Day4;


class Cars{
        String brand;
        int year;
        int id;
    // Default constructor
    Cars(){
        System.out.println("Default constructor called ");
       this.brand = "Unknown";
        this.year = 0;
    }
    // parameterized constructor
    Cars(String brand,int year){
        System.out.println("Parameterized constructor called ");
        this.brand = brand;
        this.year = year;

    }
    Cars(String brand,int year,int id){
        System.out.println("Parameterized constructor called ");
        this.brand = brand;
        this.year = year;
        this.id = id;

    }
    //Method to display car details
    void display(){
        System.out.println("Brand: " + brand + " , Year: " + year + "  , Id  :" + id);
    }

    }


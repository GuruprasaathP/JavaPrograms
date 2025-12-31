package com.java.practice.pro.Day44;

public class Car {

    private String carName;
    private int year;
    private double sellingPrice;
    private double presentPrice;
    private int kilometersDriven;
    private String fuelType;
    private String sellerType;
    private String transmission;
    private String ownerType;

    // Constructor
    public Car(String value0, int value1, double value2, double value3, int value4, String value5, String value6, String value7, String value8) {
        this.carName = value0;
        this.year = value1;
        this.sellingPrice = value2;
        this.presentPrice = value3;
        this.kilometersDriven = value4;
        this.fuelType = value5;
        this.sellerType = value6;
        this.transmission = value7;
        this.ownerType = value8;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getSellerType() {
        return sellerType;
    }

    public void setSellerType(String sellerType) {
        this.sellerType = sellerType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getKilometersDriven() {
        return kilometersDriven;
    }

    public void setKilometersDriven(int kilometersDriven) {
        this.kilometersDriven = kilometersDriven;
    }

    public double getPresentPrice() {
        return presentPrice;
    }

    public void setPresentPrice(double presentPrice) {
        this.presentPrice = presentPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", year=" + year +
                ", sellingPrice=" + sellingPrice +
                ", presentPrice=" + presentPrice +
                ", kilometersDriven=" + kilometersDriven +
                ", fuelType='" + fuelType + '\'' +
                ", sellerType='" + sellerType + '\'' +
                ", transmission='" + transmission + '\'' +
                ", ownerType='" + ownerType + '\'' +
                '}';
    }
}

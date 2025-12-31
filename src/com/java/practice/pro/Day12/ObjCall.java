package com.java.practice.pro.Day12;

public class ObjCall {
    String RiceType;
    int price;
    int gst;



    public ObjCall(String riceType, int price, int gst) {
        this.RiceType = riceType;
        this.price = price;
        this.gst = gst;
    }



    void food() {
        System.out.println("rice : " + RiceType);
        System.out.println("price : " + price);
        System.out.println("gst : " + gst);

    }


    public static void main(String[] args) {
        ObjCall obj = new ObjCall("curd rice",56,5);

        obj.food();




    }
}

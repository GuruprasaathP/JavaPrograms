package com.java.practice.pro.Day35;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String,Integer> stockPrices = new TreeMap<>();
        stockPrices.put("Microsoft",299);
        stockPrices.put("Google",250);
        stockPrices.put("Apple",150);
        stockPrices.put("orange",150);

        System.out.println("Stock price in Sorted Order : ");
        for(String company : stockPrices.keySet()){
            System.out.println("Company : "+ company + ", price: $"+ stockPrices.get(company));
        }
    }
}

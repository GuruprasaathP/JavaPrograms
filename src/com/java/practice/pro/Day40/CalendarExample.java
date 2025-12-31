package com.java.practice.pro.Day40;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar= Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DATE);
        System.out.println("Current Date: "+date + "-"+month + "-" + year);
    }
}

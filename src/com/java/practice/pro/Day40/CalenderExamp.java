package com.java.practice.pro.Day40;

import java.util.Calendar;

public class CalenderExamp {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DATE);
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("Current Date: " + date + "-" + month + "-" + year);
        System.out.println("Current day of the week : " + week);

        // add 10 days to the current date
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("After adding 10 days : "
                + calendar.get(calendar.DAY_OF_MONTH) + "-"
                + (calendar.get(calendar.MONTH) + 1)+"-"
                + calendar.get(Calendar.YEAR) );

        calendar.add(Calendar.DAY_OF_MONTH, -5);
        System.out.println("After Subracting 10 days : "
                + calendar.get(calendar.DAY_OF_MONTH) + "-"
                + (calendar.get(calendar.MONTH) + 1)+"-"
                + calendar.get(Calendar.YEAR) );

        // Set a custom date(e.g ,17th Dec 2024)
        calendar.set(2024,Calendar.DECEMBER,17);
        System.out.println("Custom Date set : "
                + calendar.get(calendar.DAY_OF_MONTH) + "-"
                + (calendar.get(calendar.MONTH) + 1) +"-"
                + calendar.get(Calendar.YEAR) );

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println("Time :"+hour + ";" + minute +";" + second);


    }

}

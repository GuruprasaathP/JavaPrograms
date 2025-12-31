package com.java.practice.pro.Day1;

public class Problem6 {
    public static void main(String[] args) {

        // in this program string is  immutable because we can not concat
        String S1 = "deepak";
        S1.concat("kumar");
        System.out.println(S1);

     // in this string can be stores in to the original string to concat it
        String S2 = "guru";
        S2 = S2.concat("prasaath");
        System.out.println(S2);
    }
}

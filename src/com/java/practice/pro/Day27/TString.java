package com.java.practice.pro.Day27;

 class TString {

    int a;

    int guru(int a){

        a = a + 3;
        return a;
    }




    public static void main(String[] args) {
        TString obj = new TString();
        int res = obj.guru(25);
        System.out.println(res);
    }
}

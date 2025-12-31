package com.java.practice.pro.Day19;


class Grandfather {
    void health() {
        System.out.println("Health is Good.");
    }
}

class Father extends Grandfather {
    void money() {
        System.out.println("Earned more money");
    }

}

class Son extends Father {
    void Study() {
        System.out.println("Study Well");
    }


}


public class multiLevel_Inheritance {
    public static void main(String[] args) {
        Son obj = new Son();
        obj.health();
        obj.money();
        obj.Study();
    }
}

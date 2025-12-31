package com.java.practice.pro.Day15;


interface S {

    void eat();

}

interface K {
    void run();

}

interface R {
    void sleep();
}


class Inte implements S, K, R {

    @Override
    public void run() {
        System.out.println("faster.");
    }

    @Override
    public void eat() {
        System.out.println("eating.....");


    }


    @Override
    public void sleep() {
        System.out.println("sle eping......");

    }
}

class InterfaceEx {
    public static void main(String[] args) {

        Inte inte = new Inte();
        inte.eat();
        inte.run();
        inte.sleep();

    }
}

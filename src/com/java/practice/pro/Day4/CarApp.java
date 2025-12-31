package com.java.practice.pro.Day4;

public class CarApp {

        public static void main(String[] args) {
            Cars car1 = new Cars();
            car1.display();
            Cars car2 = new Cars("BMW",2025);
            car2.display();
            Cars car3 = new Cars("BMW",2025,246);
            car3.display();
        }
}

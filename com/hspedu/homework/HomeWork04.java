package com.hspedu.homework;

public class HomeWork04 {
    public static void main(String[] args) {
        Manager manager = new Manager("六百", 3000, 5, 1.2);
        manager.setBonus(100);
        manager.printSal();
        Worker wang = new Worker("wang", 20, 10, 1);
        wang.printSal();

    }
}

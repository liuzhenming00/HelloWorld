package com.hspedu.homework;

public class HomeWork10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("wang", 4, "zhiyuan", '男', 399);
        Doctor doctor2 = new Doctor("w", 4, "zhiyuan", '男', 399);
        System.out.println(doctor1.equals((doctor2)));

    }
}

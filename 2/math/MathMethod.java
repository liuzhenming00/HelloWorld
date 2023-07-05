package com.math;

import org.omg.CORBA.MARSHAL;

public class MathMethod {
    public static void main(String[] args) {
        int abs = Math.abs(-9);
        System.out.println(abs);
        double pow = Math.pow(2,4);
        System.out.println(pow);
        double ceil = Math.ceil(-3.0001);
        System.out.println(ceil);
        double floor = Math.floor(-4.999);
        System.out.println(floor);
        long round = Math.round(-5.9);
        System.out.println(round);
        double sqrt = Math.sqrt(9.0);
        System.out.println(sqrt);
        for (int i = 0; i <10; i++){
            System.out.println((int)(2 + Math.random() * (7-2+1)));
        }
        int min = Math.min(1, 9);
        int max = Math.max(45, 90);
        System.out.println(min);
        System.out.println(max);

    }
}

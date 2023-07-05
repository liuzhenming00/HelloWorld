package com.Arrays;

import java.math.BigDecimal;

public class BIgDecimal_ {
    public static void main(String[] args) {
        double d = 199.33333333647564433323233342442322;
        System.out.println(d);
        BigDecimal bigDecimal = new BigDecimal("199.33333333647564433323233342442322");
        BigDecimal bigDecimal1 = new BigDecimal("1.1");
        System.out.println(bigDecimal);
        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));
        System.out.println(bigDecimal.multiply(bigDecimal1));
        System.out.println(bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING));



    }
}

package com.Arrays;

import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {
//        long l = 34546332425252525245546l;
//        System.out.println("l=" +l);
        BigInteger bigInteger = new BigInteger("345463324252525252455463");
        BigInteger bigInteger1 = new BigInteger("100");
        System.out.println(bigInteger);
        BigInteger add = bigInteger.add(bigInteger1);
        System.out.println(add);
        BigInteger subtract = bigInteger.subtract(bigInteger1);
        System.out.println(subtract);
        BigInteger multiply = bigInteger.multiply(bigInteger1);
        System.out.println(multiply);
        BigInteger divide = bigInteger.divide(bigInteger1);
        System.out.println(divide);


    }
}

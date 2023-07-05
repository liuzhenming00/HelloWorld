package com.hspedu;

public class CupNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int cupNums = runtime.availableProcessors();
System.out.println("当前cpu个数"+cupNums);
    }
}

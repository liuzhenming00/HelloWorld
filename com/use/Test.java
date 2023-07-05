package com.use;

import com.xiaoqiang.Dog;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);
        com.xiaoming.Dog dog1 = new com.xiaoming.Dog();
        System.out.println(dog1);
        System.out.println( Math.abs(-1));
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, -1, 8, 0, 34};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + "\t");

        }
    }
}

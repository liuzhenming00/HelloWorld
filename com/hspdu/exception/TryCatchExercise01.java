package com.hspdu.exception;

import java.util.Scanner;

public class TryCatchExercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (true){
            System.out.println("请输入一个整数");
            try {
                num = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是整数");
            }

        }
        System.out.println("你输入的是" +num);
    }
}

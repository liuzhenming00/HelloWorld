package com.hspdu.exception;

public class CustomExveption_ {
    public static void main(String[] args) {
        int age = 180;
        if (!(age > 70 && age <120)){
            throw new AgeException("年龄需要在18-120之间");
        }
        System.out.println("你的年龄范围正确");
    }
}
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}

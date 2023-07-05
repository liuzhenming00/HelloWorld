package com.Exercise;

public class NotPad extends Computer {
    private String color;

    public NotPad(String CPU, int disk, int memory, String color) {
        super(CPU, disk, memory);
        this.color = color;
    }
    public void Info1(){
        System.out.println(Detail() + color);
    }
}

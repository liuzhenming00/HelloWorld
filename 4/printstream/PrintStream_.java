package com.hspdu.printstream;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream ourt = System.out;
        ourt.println("hello");
        ourt.write("hello".getBytes());
        ourt.close();
        System.setOut(new PrintStream("e:\\f1.txt"));
        System.out.println("韩顺平教育");
    }
}

package com.hspdu.printstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("e:\\f2.txt"));
pw.println("hi,你好");
pw.close();

    }
}

package com.hspdu.transformation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\a.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line = br.readLine();
        System.out.println(line);
        br.close();
    }
}

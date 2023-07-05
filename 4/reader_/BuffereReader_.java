package com.hspdu.reader_;

import java.io.BufferedReader;
import java.io.FileReader;

public class BuffereReader_ {
    public static void main(String[] args) throws Exception {
        String filePath = "e:\\story.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedReader.close();

    }
}

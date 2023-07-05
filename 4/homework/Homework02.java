package com.hspdu.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class Homework02 {
    public static void main(String[] args) {
       String filePath = "e:\\a.txt";
       BufferedReader bufferedReader=null;
        String readLine = " ";
        int linNum = 0;
        try {
             bufferedReader = new BufferedReader(new FileReader(filePath));
            while ((readLine = bufferedReader.readLine())!=null){
                System.out.println(++linNum+readLine);

            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader!= null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

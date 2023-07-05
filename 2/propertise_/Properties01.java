package com.hspdu.propertise_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Properties01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\mysql.properties"));
        String line = " ";
        while ((line = br.readLine())!=null){
           String[] spilt = line.split("=");


            System.out.println(spilt[0]+"的值是"+spilt[1]);


        }
        br.close();
    }
}

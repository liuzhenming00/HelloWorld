package com.stringbuffer;

import java.util.Scanner;

public class StringBufferExercise01 {
    public static void main(String[] args) {
        String price = "234253453461234556.78";
        StringBuffer stringBuffer = new StringBuffer(price);
        int i = stringBuffer.lastIndexOf(".");
        for(int j = i-3; j > 0; j-=3){
            stringBuffer = stringBuffer.insert(j,",");
        }

        System.out.println(stringBuffer);
    }
}

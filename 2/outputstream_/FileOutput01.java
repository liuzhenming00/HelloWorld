package com.hspdu.outputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput01 {
    public static void main(String[] args) {

    }
    @Test
    public void write(){
        String filePath = "e:\\a.txt";
        FileOutputStream fileOutput = null;
        try {
             fileOutput = new FileOutputStream(filePath,true);
             String str = "hello,world";
        fileOutput.write(str.getBytes(),0,3);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

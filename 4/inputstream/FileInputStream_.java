package com.hspdu.inputstream;


import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01(){
        String filePath = "E:\\hello.txt";
        int read = 0;
        FileInputStream fileInputStream = null;
        try {

             fileInputStream = new FileInputStream(filePath);
      while ((read = fileInputStream.read())!=-1){
          System.out.print((char)read);
      }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    @Test
    public void readFile02(){
        String filePath = "e:\\hello.txt";
        int read = 0;
        byte[] by = new byte[8];
        FileInputStream fileInputStream = null;
        try {

            fileInputStream = new FileInputStream(filePath);
            while ((read = fileInputStream.read(by))!=-1){
                System.out.print(new String(by,0,read));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


  }
}

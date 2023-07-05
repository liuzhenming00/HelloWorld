package com.hspdu.reader_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FieleReader_ {
    public static void main(String[] args) {


    }
    @Test
    public void read01() {
        String filePath = "e:\\story.txt";
        FileReader fileReader = null;
        int data = 0;
        try {
            fileReader = new FileReader(filePath);
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void read02() {
        System.out.println("第二种");
        String filePath = "e:\\story.txt";
        FileReader fileReader = null;
        int readlen = 0;
        char[] buf = new char[8];
        try {
            fileReader = new FileReader(filePath);
            while ((readlen = fileReader.read(buf)) != -1) {
                System.out.print(new String(buf,0,readlen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

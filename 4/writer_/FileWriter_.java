package com.hspdu.writer_;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriter_ {
    public static void main(String[] args) {
        String filePath = "e:\\note.txt";
        FileWriter writer = null;
        char[] chars = {'a','b','c'};
        try {
           writer = new FileWriter(filePath);
            writer.write('H');
            writer.write(chars);
            writer.write("韩顺平教育".toCharArray(),0,2);
            writer.write(" 你好，北京");
            writer.write(" 上海北京",0,2);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

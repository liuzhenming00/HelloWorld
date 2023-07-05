package com.hspdu.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriter_ {
    public static void main(String[] args)throws Exception {
        String filePath = "e:\\ok.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        bufferedWriter.write("hello1,韩顺平教育");
        bufferedWriter.newLine();
        bufferedWriter.write("hello2,韩顺平教育");
        bufferedWriter.newLine();
        bufferedWriter.write("hello3,韩顺平教育");
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}

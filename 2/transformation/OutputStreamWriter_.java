package com.hspdu.transformation;

import java.io.*;

public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\a.txt";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath),"utf-8");
        osw.write("韩顺平教育");
osw.close();




    }
}

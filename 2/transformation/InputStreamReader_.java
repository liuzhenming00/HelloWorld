package com.hspdu.transformation;

import java.io.*;

public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\a.txt";
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath), "gbk");
        BufferedReader br = new BufferedReader(inputStreamReader);
        String s = br.readLine();
        System.out.println(s);
        br.close();
    }
}

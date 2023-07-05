package com.hspdu.writer_;

import com.hspdu.reader_.BuffereReader_;

import java.io.*;

public class BufferCopy_ {
    public static void main(String[] args)throws Exception {
        String srcFilPath = "e:\\story.txt";
        String destFilPath = "e:\\story1.txt";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;

            br = new BufferedReader(new FileReader(srcFilPath));
            bw = new BufferedWriter(new FileWriter(destFilPath));
            while ((line = br.readLine())!=null) {
                bw.write(line);
                bw.newLine();
            }





                    br.close();

                    bw.close();


        }



}

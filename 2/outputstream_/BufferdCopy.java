package com.hspdu.outputstream_;

import java.io.*;

public class BufferdCopy {
    public static void main(String[] args) {
        String srcFilePath = "e:\\bb.jpg";
        String destFilePath = "e:\\hsp.jpg";
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
           byte[] bytes = new byte[8];
           int read = 0;

            while ((read=bis.read(bytes))!=-1){
                bos.write(bytes,0,read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis!=null){
                    bis.close();
                }
                if (bos!=null){
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

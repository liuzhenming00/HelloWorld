package com.hspdu.outputstream_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String srcfilePath = "e:\\bb.jpg";
        String destfilePath = "d:\\bb.jpg";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(srcfilePath);
            fileOutputStream = new FileOutputStream(destfilePath);
            byte[] buf = new byte[1024];
            int readlen = 0;
            while ((readlen = fileInputStream.read(buf))!=-1){
                fileOutputStream.write(buf,0,readlen);
            }
            System.out.println("拷贝成功");
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null)
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        if (fileOutputStream != null){
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

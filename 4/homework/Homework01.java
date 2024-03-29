package com.hspdu.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Homework01 {
    public static void main(String[] args) throws IOException {
        String directoruPath = "e:\\mytemp";
        File file = new File(directoruPath);
        if (!file.exists()){
            if (file.mkdirs()){
                System.out.println(directoruPath+"创建成功");
            }else {
                System.out.println(directoruPath+"创建失败");
            }
        }
        String filePath = directoruPath + "\\hello.txt";
         file = new File(filePath);
        if (!file.exists()){
            if (file.createNewFile()){
                System.out.println("创建成功");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write("hello");
                bufferedWriter.close();
            }else {
                System.out.println("创建失败");
            }
        }
        else {
            System.out.println("已存在");
        }

    }
}

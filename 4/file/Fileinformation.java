package com.hspdu.file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Fileinformation {
    public static void main(String[] args) {

    }
    @Test
    public void  info(){
        File file = new File("e:\\news1.txt");
        System.out.println("文件名字："+file.getName());
        System.out.println("文件绝对路径："+file.getAbsolutePath());
        System.out.println("文件父目录："+file.getParent());
        System.out.println("文件大下："+file.length());
        System.out.println("文件是否存在："+file.exists());
        System.out.println("是不是文件："+file.isFile());
        System.out.println("是不是目录："+file.isDirectory());
    }
}

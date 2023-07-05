package com.hspdu.file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Directory_ {
    public static void main(String[] args) {

    }
    @Test
    public void m1(){
        String filrPath = "e\\news1.txt";
        File file = new File(filrPath);
        if (file.exists()){
            if (file.delete()){
                System.out.println(filrPath+"删除成功");
            }else {
                System.out.println(filrPath+"删除失败");
            }
        }else {
            System.out.println("不存在");
        }
    }
    @Test
    public void m2(){
        String filrPath = "D\\demo02";
        File file = new File(filrPath);
        if (file.exists()){
            if (file.delete()){
                System.out.println(filrPath+"删除成功");
            }else {
                System.out.println(filrPath+"删除失败");
            }
        }else {
            System.out.println("不存在");
        }
    }
    @Test
    public void m3(){
        String filrPath = "D\\demo\\a\\b\\c";
        File file = new File(filrPath);
        if (file.exists()){

                System.out.println("存在");

        }else {
            if(file.mkdirs()){
                System.out.println("成功");
            }else {
                System.out.println("失败");
            }
        }
    }
}

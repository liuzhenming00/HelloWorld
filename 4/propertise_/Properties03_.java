package com.hspdu.propertise_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties03_ {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("charset","utf8");
        properties.setProperty("user","汤姆");
        properties.setProperty("pwd","88888");
        properties.store(new FileOutputStream("src\\mysql02.properties"),null);
        System.out.println("保存文件配置成功");





    }
}

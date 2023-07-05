package com.hspdu.propertise_;

import com.hspdu.reader_.FieleReader_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class Propertises02 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader("src\\mysql.properties"));
        properties.list(System.out);
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println("用户名是"+user);
        System.out.println("密码是"+pwd);
    }
}

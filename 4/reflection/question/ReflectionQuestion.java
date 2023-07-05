package com.hspdu.reflection.question;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectionQuestion {
    public static void main(String[] args) throws  Exception {
        //com.hspdu.Cat cat = new com.hspdu.Cat();
       // cat.hi();
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String  classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();
        System.out.println("classfullpath=" +classfullpath);
        System.out.println("method=" +methodName);
        Class cls = Class.forName(classfullpath);
        Object o = cls.newInstance();
        Method method1 = cls.getMethod(methodName);
        method1.invoke(o);
    }
}

package com.hspdu.reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;
@SuppressWarnings({"all"})
public class Reflection01 {
    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String  classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();


        Class cls = Class.forName(classfullpath);
        Object o = cls.newInstance();
        Method method1 = cls.getMethod(methodName);
        method1.invoke(o);
        Field age = cls.getField("age");
        System.out.println(age.get(o));
        Constructor constructor = cls.getConstructor();
        System.out.println(constructor);


    }
}

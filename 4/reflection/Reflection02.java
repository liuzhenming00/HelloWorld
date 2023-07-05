package com.hspdu.reflection;

import com.hspdu.Cat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        m1();
        m2();
        m3();
    }
    public static void m1(){
        Cat cat = new Cat() ;
        long start= System.currentTimeMillis();
        for (int i = 0; i <90000000 ; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法调用hi 耗时=" +(end - start));

    }
    public static void m2() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("com.hspdu.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        long start= System.currentTimeMillis();
        for (int i = 0; i <90000000 ; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时=" +(end - start));

    }
    public static void m3() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("com.hspdu.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        hi.setAccessible(true);
        long start= System.currentTimeMillis();
        for (int i = 0; i <90000000 ; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时=" +(end - start));

    }

}

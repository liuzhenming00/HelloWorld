package com.hspdu.class_;

import java.lang.reflect.Field;

public class class01 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        String classAllPath = "com.hspdu.Car";
        Class<?> cls = Class.forName(classAllPath);
        System.out.println(cls);
        System.out.println(cls.getClass());
        System.out.println(cls.getPackage());
        System.out.println(cls.getName());
        Object o = cls.newInstance();
        System.out.println(o);
        Field brand = cls.getField("brand");
        System.out.println(brand.get(o));
        brand.set(o,"奔驰");
        System.out.println(brand.get(o));
        Field[] fields = cls.getFields();
        for (Field f :fields) {
            System.out.println(f.getName());
        }


    }
}

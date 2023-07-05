package com.hspdu.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectCreatInstance {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> uerClass = Class.forName("com.hspdu.reflection.User");
        Object o = uerClass.newInstance();
System.out.println(o);
        Constructor<?> constructor = uerClass.getConstructor(String.class);
        Object hsp = constructor.newInstance("hsp");

        System.out.println(hsp);

        Constructor<?> constructor1 = uerClass.getDeclaredConstructor(int.class, String.class);
       constructor1.setAccessible(true);
        Object zhang = constructor1.newInstance(100, "张三丰");
        System.out.println(zhang);

    }
}
class User{
    private  int age=10;
    private String name="韩顺平教育";
    public User(){

    }
    public User(String name){
        this.name = name;
    }
    private User(int age,String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

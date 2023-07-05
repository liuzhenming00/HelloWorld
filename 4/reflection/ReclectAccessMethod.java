package com.hspdu.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReclectAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> bossClass = Class.forName("com.hspdu.reflection.Boss");
        Object o = bossClass.newInstance();
        Method hi = bossClass.getDeclaredMethod("hi",String.class);
        hi.invoke(o,"韩顺平");
        Method say = bossClass.getDeclaredMethod("say", int.class, String.class, char.class);
       say.setAccessible(true);
       System.out.println( say.invoke(o,100,"张三",'男'));
        Object invoke = say.invoke(o, 300, "王五", '男');
        System.out.println(invoke);


    }
}
class Boss{
    public int age;
    private static String name;
    public Boss(){

    }
    private static String say(int n,String s,char c){
        return n + " " +s +" "+c;
    }
    public void hi(String s){
        System.out.println("hi"+s);
    }
}

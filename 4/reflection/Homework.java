package com.hspdu.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.SplittableRandom;

public class Homework {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException {
        //Class<PrivateTest> privateTestClass = PrivateTest.class;
        Class<?> privateTestClass = Class.forName("com.hspdu.reflection.PrivateTest");
        Object privateTest = privateTestClass.newInstance();
        Field name = privateTestClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(privateTest,"天龙八部");
        Method getName = privateTestClass.getMethod("getName");
        Object invoke = getName.invoke(privateTest);
        System.out.println(invoke);
    }
}
class PrivateTest{
    private String name = "hellokitty";
    public String getName(){
        return name;
    }
}

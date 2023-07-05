package com.hspdu.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Homework02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
      Class<?> filecls = Class.forName("java.io.File");
        Constructor<?>[] declaredConstructors = filecls.getDeclaredConstructors();
        for (Constructor constructor :declaredConstructors) {
            System.out.println(constructor);

        }
        Constructor<?> declaredConstructor = filecls.getDeclaredConstructor(String.class);
        String filePath = "e:\\mynew.txt";
        Object file = declaredConstructor.newInstance(filePath);
        Method createNewFile = filecls.getMethod("createNewFile");
        createNewFile.invoke(file);
        System.out.println("文件创建成功"+filePath);

    }
}

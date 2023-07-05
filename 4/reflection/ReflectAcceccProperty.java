package com.hspdu.reflection;

import java.lang.reflect.Field;

public class ReflectAcceccProperty {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchFieldException {
        Class<?> stuClass = Class.forName("com.hspdu.reflection.Student");
        Object o = stuClass.newInstance();
        Field age = stuClass.getField("age");
        age.set(o,88);
        System.out.println(o);
        Field name = stuClass.getDeclaredField("name");
       name.setAccessible(true);
        name.set(o,"laohan");
        System.out.println(o);
        System.out.println(name.get(o));

    }
}
class Student{
    public int age;
    private static String name;
    public Student(){


    }

    @Override
    public String toString() {
        return "Student[age =" + age+",neme ="+name +"]";
    }

}

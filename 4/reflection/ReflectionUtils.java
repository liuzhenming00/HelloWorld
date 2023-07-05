package com.hspdu.reflection;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public static void main(String[] args) throws ClassNotFoundException {



    }
    @Test
    public void api_02() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.hspdu.reflection.Person");
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field.getName()+field.getModifiers()+field.getType());

        }

        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method.getName()+method.getModifiers()
            +method.getReturnType());
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class aClass1 :parameterTypes) {
                System.out.println(aClass1);
            }

        }

        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class aClass1 :parameterTypes) {
                System.out.println(aClass1);
            }

        }



    }
    @Test
    public void api_01() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.hspdu.reflection.Person");
        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field.getName());

        }
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method.getName());

        }
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
        }
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructors) {
            System.out.println(constructor.getName());
        }
        System.out.println(aClass.getPackage());
        Class<?> superclass = aClass.getSuperclass();
        System.out.println(superclass);
        Class<?>[] interfaces = aClass.getInterfaces();
        for (Class c : interfaces) {
            System.out.println(c);

        }
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}
class A{
    public String hobby;
    public void hi(){

    }
    public A(){

    }
}
interface IA{

}
interface IB{

}
class Person extends A implements IA,IB{
    public String name;
    protected static int age;
    String job;
    private double sal;
    public Person(){

    }
    public Person(String name){

    }
    private Person(String name,int age){

    }
public void m1(String name,int age,double sal){

}
protected void m2(){

}
void m3(){

}
private void m4(){

}
}

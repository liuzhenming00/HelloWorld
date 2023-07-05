package com.hspdu.class_;

import com.hspdu.Car;

public class GetClass_ {
    public static void main(String[] args) throws ClassNotFoundException {
        String classAllPath = "com.hspdu.Car";
        Class<?> cls1 = Class.forName(classAllPath);
        System.out.println(cls1);
        Class<Car> cls2 = Car.class;
        System.out.println(cls2);
        Car car = new Car();
        Class<? extends Car> cls3 = car.getClass();
        System.out.println(cls3);
        ClassLoader classLoader = car.getClass().getClassLoader();
        Class<?> cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4);
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Integer> type = Integer.TYPE;
        Class<Character> type1 = Character.TYPE;

    }
}

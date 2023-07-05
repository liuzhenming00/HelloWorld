package com.hspedu.override;

public class OverrideExercise {
    public static void main(String[] args) {
        Person jack = new Person("jack", 18);
        System.out.println(jack.say());
        Student smith = new Student("smith", 30, "123",355);
        System.out.println(smith.say());
    }
}

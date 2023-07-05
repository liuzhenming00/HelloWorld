package com.improve;

import java.util.*;

public class GenericExercise {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("jack",18));
        students.add(new Student("tom",28));
        students.add(new Student("mary",19));
        for (Student studen :students) {
            System.out.println(studen);

        }
        HashMap<String, Student> map = new HashMap<>();
        map.put("milan",new Student("milan",38));
        map.put("smith",new Student("smith",48));
        map.put("hsp",new Student("hsp",28));
        Set<Map.Entry<String, Student>> set = map.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next.getKey()+"-"+next.getValue());
        }

    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
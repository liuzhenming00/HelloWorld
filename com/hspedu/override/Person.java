package com.hspedu.override;

public class Person {
    private  String name;
    private int age;
    public String say(){
        return "信息如下" + "name =" + name + " age=" + age;
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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

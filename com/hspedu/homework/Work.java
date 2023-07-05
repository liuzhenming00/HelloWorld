package com.hspedu.homework;

public class Work {
    private String name;
    private int age;
    private double sal;

    public Work(String name, int age, double sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
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

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    public void getInfo(){
        System.out.println("信息如下:");
        System.out.println("姓名:" + name + " 年龄：" + age + " 工资为:" + sal);
    }
}

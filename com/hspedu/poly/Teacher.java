package com.hspedu.poly;

public class Teacher extends Person {
    private double sal;

    public Teacher(String name, int age, double sal) {
        super(name, age);
        this.sal = sal;
    }

    @Override
    public String say() {
        return "老师" + super.say() + " sal =" + sal;
    }

    public void teach() {
        System.out.println("老师" + getName() + "正在批改作业");
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}

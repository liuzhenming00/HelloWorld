package com.hspedu.homework;

public class Teacherss extends PPerson{
    private int work_age;

    public Teacherss(String name, char gender, int age, int work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
    public void teach(){
        System.out.println("我承诺：我会认真教学");
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }
    public void printInfo(){
        System.out.println("老师的信息如下：");
        System.out.println(super.basicInfo());
        System.out.println("工龄：" + work_age);
        teach();
        System.out.println(play());

    }

    @Override
    public String toString() {
        return "Teacherss{" +
                "work_age=" + work_age +
                '}'+super.toString();
    }
}

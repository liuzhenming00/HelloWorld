package com.hspedu.extend;

public class extend01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.shouInfo();
System.out.println("=============");
        graduate graduate = new graduate();

        graduate.name = "老明";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(100);
        graduate.shouInfo();



    }
}

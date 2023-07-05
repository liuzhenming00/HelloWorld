package com.hspedu.homework;

public class HomeWor05 {
    public static void main(String[] args) {
        Work work = new Work("李白",20,2000);
        work.getInfo();
        Pessant pessant = new Pessant("王伟", 40, 3000);
        pessant.getInfo();
        Teachers teachers = new Teachers("万云", 28, 4000);
        teachers.setWorkDays(7);
        teachers.setWorkSal(200);
        teachers.getInfo();
        Scientist scientist = new Scientist("云云", 59, 8000);
        scientist.setBonus(2000);
        scientist.getInfo();

    }
}

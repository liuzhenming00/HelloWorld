package com.hspedu.extend;

public class graduate {
    public String name;
    public int age;
    private double score;
    public void setScore(double score){
        this.score = score;
    }

    public void testing() {
        System.out.println("大学生" + name + "正在考大学数学");
    }
        public void shouInfo(){
            System.out.println("大学生名" + name + " 年龄" + age + "成绩" + score);
        }
    }


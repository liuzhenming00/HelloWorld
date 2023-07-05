package com.hspedu;

public class StringMethod02 {
    public static void main(String[] args) {
        String name = "韩顺平";
        int age = 18;
        char gender = '男';
        double score = 90.0/ 3;
        String info =
                "我的姓名是" +name +"年龄是"+age+"成绩是" + score+"性别是"+gender+"。希望大家喜欢我";
System.out.println(info);
String formatstr = "我的名字是%s 我的年龄是%d 我的性别是%c 我的成绩是%.2f.希望大家喜欢我";
String info2 = String.format(formatstr, name,age,gender,score);
System.out.println(info2);
    }
}

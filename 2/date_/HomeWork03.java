package com.date_;

public class HomeWork03 {
    public static void main(String[] args) {
        String name = "han shun ping";
        printName(name);
    }
    public static void printName(String name){
        if (name == null){
            System.out.println("name不能为空");
            return;
        }
        String[] split = name.split(" ");
        if (split.length != 3 ){
            System.out.println("输入的格式不对");
            return;
        }
        String format = String.format("%s,%s.%c",split[2],split[0],split[1].toUpperCase().charAt(0));
   System.out.println(format);
    }
}

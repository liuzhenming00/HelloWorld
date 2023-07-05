package com.hspedu;

public class StringUML {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));
        String username = "john";
        if("john".equalsIgnoreCase(username)){
            System.out.println("susses");
        }else {
            System.out.println("Failure");
        }
        System.out.println("韩顺平".length());
        String s1 = "wertr@ferg@h";
        int index = s1.indexOf('@');
        System.out.println(index);
        System.out.println(s1.indexOf("we"));
        String s2 = "wertr@ferg@h";
        int lastindex = s2.lastIndexOf('@');
        System.out.println(lastindex);
        String name = "hello，张三";
        System.out.println(name.substring(6));
        System.out.println(name.substring(0,6));
    }
}

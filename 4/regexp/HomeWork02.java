package com.hspedu.regexp;

public class HomeWork02 {
    public static void main(String[] args) {
        String content = "-123";
        String regStr = "^[-+]?([1-9]\\d*|0)+(\\.\\d+)?$";
        if (content.matches(regStr)){
            System.out.println("匹配成功");
        }else {
            System.out.println("匹配失败");
        }
    }
}

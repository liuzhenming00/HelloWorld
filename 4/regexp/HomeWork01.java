package com.hspedu.regexp;

public class HomeWork01 {
    public static void main(String[] args) {
        String content = "hsp@shu.com.cn";
        String regStr = "[\\w-]+@([a-zA-Z]+\\.)+[a-zA-Z]+";
        if (content.matches(regStr)){
            System.out.println("匹配成功");
        }else {
            System.out.println("匹配失败");
        }
    }
}

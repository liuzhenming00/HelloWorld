package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork03 {
    public static void main(String[] args) {
        String content = "http://www.sohu.com:8080/abc/index.htm";
        String regStr = "^([a-zA-Z]+)://([a-zA-Z.]+):(\\d+)[\\w-/]*/([\\w.]+)$";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        if (matcher.matches()){
            System.out.println("整体匹配的="+matcher.group(0));
        }else {
            System.out.println("没有匹配成功");
        }
    }
}

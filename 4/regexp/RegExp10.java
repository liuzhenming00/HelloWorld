package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp10 {
    public static void main(String[] args) {
        String content = "13234574364";
//        String regStr = "^[\u0391-\uffe5]+$";
//        String regStr = "^[1-9]\\d{5}$";
//        String regStr = "^[1-9]\\d{4,9}$";
        String regStr = "^1[3|4|5|8]\\d{9}$";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        if (matcher.find()){
            System.out.println("满足格式");
        }else {
            System.out.println("不满足格式");
        }
    }
}

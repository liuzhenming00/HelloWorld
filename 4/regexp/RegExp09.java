package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp09 {
    public static void main(String[] args) {
        String content = "hello111111 ok";
        String  regStr = "\\d+?";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()){
            System.out.println("找到：" + matcher.group(0));
        }

    }
}

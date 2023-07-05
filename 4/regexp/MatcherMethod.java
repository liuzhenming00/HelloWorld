package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherMethod {
    public static void main(String[] args) {
        String content = "hello edu jackhspdu tom hellohspdu smith hello";
        String regStr = "hello";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()){
            System.out.println("===============");
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            System.out.println("找到："+content.substring(matcher.start(),matcher.end()));

        }
         regStr="hspd";
        compile=Pattern.compile(regStr);
        matcher = compile.matcher(content);
        String newContent = matcher.replaceAll("韩顺平教育");
        System.out.println(newContent);

    }
}

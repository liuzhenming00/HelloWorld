package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp13 {
    public static void main(String[] args) {
        String  content = "我....我要....学学学学....编程java！";
       Pattern compile = Pattern.compile("\\.");
        Matcher matcher = compile.matcher(content);
         content = matcher.replaceAll("");
//         System.out.println("content=" +content);
//
//
//        compile = Pattern.compile("(.)\\1+");
//        matcher = compile.matcher(content);
//        while (matcher.find()){
//            System.out.println("找到:"+matcher.group(0));
//        }
//        content = matcher.replaceAll("$1");
//        System.out.println("content="+content);
        content=Pattern.compile("(.)\\1+").matcher(content).replaceAll("$1");
        System.out.println("content=" +content);
    }
}

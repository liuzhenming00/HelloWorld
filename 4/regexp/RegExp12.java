package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp12 {
    public static void main(String[] args) {
        String content = "he1234llo3333 j12321-333999111ac1551k14 tom11 jack22  yyy xxx";
//        String regStr = "(\\d)\\1";
//        String regStr = "(\\d)\\1{4}";
//        String regStr = "(\\d)(\\d)\\2\\1";
        String regStr = "\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()){
            System.out.println("找到"+matcher.group(0));
        }
    }
}

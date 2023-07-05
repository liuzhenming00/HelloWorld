package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regExp03 {
    public static void main(String[] args) {
        String content = "a11c8ab _cABCy@";
       // String regStr = "[a-z]";
        //String regStr = "[A-Z]";
        //String regStr = "abc";
        //String regStr = "[0-9]";
       // String regStr = "(?i)abc";
       // String regStr = "[^a-z]";
        //String regStr = "[^0-9]";
        //String  regStr = "[abcd]";
        //String  regStr = "\\D";
        //String  regStr = "\\w";
        //String  regStr = "\\W";
        //String  regStr = "\\s";
        //String  regStr = "\\S";
        String  regStr = ".";
        Pattern compile = Pattern.compile(regStr,Pattern.CASE_INSENSITIVE);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()){
            System.out.println("找到"+matcher.group(0));
        }
    }
}

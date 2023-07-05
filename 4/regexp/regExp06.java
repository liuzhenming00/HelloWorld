package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regExp06 {
    public static void main(String[] args) {
        String content = "hanshunping sphan nhan";
//        String regStr = "^[0-9]+[a-z]*";
//        String regStr = "^[0-9]+[a-z]+$";
        String regStr = "han\\B";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()){
            System.out.println("找到="+matcher.group(0));
        }
    }
}

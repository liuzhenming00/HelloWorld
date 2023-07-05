package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp04 {
    public static void main(String[] args) {
        String content = "hanshunping 韩 寒冷";
        String regStr = "han|韩|寒冷";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()){
            System.out.println("找到"+matcher.group(0));
        }
    }
}
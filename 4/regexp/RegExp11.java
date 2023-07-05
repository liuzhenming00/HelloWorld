package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp11 {
    public static void main(String[] args) {
        String content = "https://www.bilibili.com/video/BV17h411P7XW/?spm_id_from=333.1007.tianma.2-2-5.click&vd_source=a853bd7c836ac9c5c5ef2269f1536e88";
        String  regStr = "^((http|https)://)?([\\w-]+\\.)+[\\w-]+(\\/[\\w-?=&/%.]*)?$";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        if (matcher.find()){
            System.out.println("满足格式");
        }else {
            System.out.println("不满足格式");
        }


    }
}

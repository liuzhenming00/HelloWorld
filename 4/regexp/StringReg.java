package com.hspedu.regexp;

public class StringReg {
    public static void main(String[] args) {
        String content="就那几个你，JDK1.3,JDK1.4"+
                "男人江南风景你人工，J2EE1.3"+
                "2002年2月26日，J2SE1.4";
         content = content.replaceAll("JDK1\\.3|JDK1\\.4", "JDK");
         System.out.println(content);
         content = "13688889999";
         if (content.matches("1(38)|(39)\\d{8}")){
             System.out.println("验证成功");
         }else {
             System.out.println("验证失败");
         }
         System.out.println("===============");
         content = "hello#abc-jack12smith~北京";
        String[] split = content.split("#|-|~|\\d+");
        for (String s :split) {
            System.out.println(s);
        }


    }
}

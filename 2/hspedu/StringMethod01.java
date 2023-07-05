package com.hspedu;

public class StringMethod01 {
    public static void main(String[] args) {
        String name = "hello";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        String s1 = "暴雨";
        s1 = s1.concat("林黛玉").concat("薛宝钗").concat("together");
        System.out.println(s1);
        s1 = "暴雨 and 林黛玉 林黛玉 林黛玉";
        s1 = s1.replace("林黛玉","薛宝钗");
        System.out.println(s1);
        String pom = "grgjrigjir,Grrrg,rrhrrtr,gjirjgir";
        String[] spilt = pom.split(",");
        pom = "E\\aaa\\bbb";
        spilt = pom.split("\\\\");
        for (int i = 0; i < spilt.length ; i++) {
            System.out.println(spilt[i]);

        }
        String s = "happy";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            System.out.println(chars[i]);
        }
        String a = "gcegqwwwr";
        String b = "gaeg";
        System.out.println(a.compareTo(b));
    }
}

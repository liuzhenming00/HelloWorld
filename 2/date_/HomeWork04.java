package com.date_;

public class HomeWork04 {
    public static void main(String[] args) {
        String str = "qrerWEER13434#$%";
        countstr(str);
    }
    public static void countstr(String str){
        if (str == null){
            System.out.println("输入不能为null");
            return;
        }
        int strlen = str.length();
        int numCount = 0;
        int lowerCount = 0;
        int upperCase = 0;
        int others=0;
        for (int i = 0; i <strlen ; i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                numCount++;

            }else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                lowerCount++;
            }else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                upperCase++;
            }else {
                others++;
            }

        }
        System.out.println("数字有" +numCount);
        System.out.println("大写有" +upperCase);
        System.out.println("小写有" +lowerCount);
        System.out.println("其他有" +others);
    }
}

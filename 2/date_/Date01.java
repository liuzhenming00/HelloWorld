package com.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        String s = "2023年05月31日 05:00:22 星期三";
        Date parse = simpleDateFormat.parse(s);
        System.out.println(parse);
    }
}

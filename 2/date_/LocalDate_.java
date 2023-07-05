package com.date_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDate_ {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();


        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getMonthValue());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());

    }
}

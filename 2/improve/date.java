package com.improve;

import java.util.Comparator;

public class date implements Comparable<date> {
    private int year;
    private int month;
    private int day;

    public date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(date o) {
        int i1 = year - o.getYear();
        if (i1 != 0) {
            return i1;
        }
        int i2 = month - o.getMonth();
        if (i2 != 0) {
            return i2;
        }
        return day - o.getDay();
    }
}

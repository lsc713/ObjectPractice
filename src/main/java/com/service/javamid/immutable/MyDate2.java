package com.service.javamid.immutable;

public class MyDate2 {

    private final int year;
    private final int month;
    private final int day;

    public MyDate2(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate2 withYear(int changeYear) {
        return new MyDate2(changeYear, month, day);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}

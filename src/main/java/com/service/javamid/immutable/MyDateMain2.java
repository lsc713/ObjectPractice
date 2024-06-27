package com.service.javamid.immutable;

public class MyDateMain2 {

    public static void main(String[] args) {
        MyDate2 date1 = new MyDate2(2024, 1, 1);
        MyDate2 date2 = date1;

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        MyDate2 myDate2 = date1.withYear(2025);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + myDate2);

    }


}

package com.service.javamid.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,orange";
        String[] split = fruits.split(",");
        for (String s : split) {
            System.out.println(s);
        }
        String joined = String.join("->", split);
        System.out.println(joined);
    }

}

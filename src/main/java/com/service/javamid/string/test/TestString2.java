package com.service.javamid.string.test;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm"};
        int result1 = 0;
        for (String s : arr) {
            int length = s.length();
            System.out.println(s + ":" + length);
            result1 += length;
        }
        System.out.println(result1);
    }

}

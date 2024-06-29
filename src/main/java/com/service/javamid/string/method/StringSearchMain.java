package com.service.javamid.string.method;

public class StringSearchMain {

    public static void main(String[] args) {

        String str = "Hello Java! Welcome to Java world";
        System.out.println(str.contains("java"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.lastIndexOf("Java"));
    }

}

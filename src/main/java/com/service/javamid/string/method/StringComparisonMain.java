package com.service.javamid.string.method;

public class StringComparisonMain {

    public static void main(String[] args) {
        String str1 = "Hello, Java";
        String str2 = "hello, java";
        String str3 = "Hello, World";

        System.out.println(str1.equals(str2));

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println("b".compareTo("a"));
        System.out.println("a".compareTo("b"));
        System.out.println("c".compareTo("a"));
        System.out.println(str1.startsWith("Hello"));
    }

}

package com.service.javamid.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "he";
        String b = "llo";

        String result1 = a + b;
        String result2 = a.concat(b);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }

}

package com.service.javamid.string.builder;

public class LoopStringMain {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 10000; i++) {
            result += "Hello World!";
        }
        long end = System.currentTimeMillis();

        System.out.println(result);
        System.out.println(end-start);
    }

}

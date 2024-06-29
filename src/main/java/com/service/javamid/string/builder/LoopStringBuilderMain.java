package com.service.javamid.string.builder;

public class LoopStringBuilderMain {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("Hello Java");
        }
        String result = sb.toString();
        long end = System.currentTimeMillis();

        System.out.println(result);
        System.out.println(end-start);
    }

}

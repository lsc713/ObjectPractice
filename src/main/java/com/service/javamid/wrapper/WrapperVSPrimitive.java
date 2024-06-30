package com.service.javamid.wrapper;

public class WrapperVSPrimitive {

    public static void main(String[] args) {
        int iterations = 1_000_000_000;
        long startTime, endTime;

        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println(sumPrimitive);
        System.out.println(endTime - startTime);


        Long sumPrimitive1 = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive1 += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println(sumPrimitive1);
        System.out.println(endTime - startTime);
    }

}

package com.service.javamid.wrapper;

public class AutoBoxingMain {

    public static void main(String[] args) {
        int value = 8;
        Integer newInteger = Integer.valueOf(value);

        int unboxValue = newInteger.intValue();

        System.out.println(newInteger);
        System.out.println(unboxValue);
    }

}

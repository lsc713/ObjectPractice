package com.service.javamid.wrapper;

public class AutoBoxingMain2 {

    public static void main(String[] args) {
        int value = 8;
        //Wrapping이 자동임
        Integer newInteger = value;

        int unboxValue = newInteger;

        System.out.println(newInteger);
        System.out.println(unboxValue);
    }

}

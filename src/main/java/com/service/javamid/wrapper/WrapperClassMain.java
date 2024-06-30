package com.service.javamid.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10);
        Integer i = Integer.valueOf(10);
        System.out.println(i);
        double i1 = i.longValue();
        System.out.println(i1);
    }

}

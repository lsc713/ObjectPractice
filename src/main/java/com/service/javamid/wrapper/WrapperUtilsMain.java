package com.service.javamid.wrapper;

public class WrapperUtilsMain {

    public static void main(String[] args) {
        Integer li1 = Integer.valueOf(10);
        Integer li2 = Integer.valueOf("10");
        int value = Integer.parseInt("10");
        System.out.println(value);

        int compare = li1.compareTo(11);
        System.out.println(compare);
    }

}

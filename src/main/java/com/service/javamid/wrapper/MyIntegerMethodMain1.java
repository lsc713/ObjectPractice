package com.service.javamid.wrapper;

public class MyIntegerMethodMain1 {

    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);
        int li = myInteger.compareTo(5);
        int li1 = myInteger.compareTo(10);
        int li2 = myInteger.compareTo(55);
        System.out.println(li);
        System.out.println(li2);
        System.out.println(li1);
    }

}

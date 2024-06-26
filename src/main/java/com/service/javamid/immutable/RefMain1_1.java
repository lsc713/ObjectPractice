package com.service.javamid.immutable;

public class RefMain1_1 {

    public static void main(String[] args) {

        Address a = new Address("seoul");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("busan");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}

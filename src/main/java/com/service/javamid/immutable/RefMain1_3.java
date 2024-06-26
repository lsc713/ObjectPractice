package com.service.javamid.immutable;

public class RefMain1_3 {

    public static void main(String[] args) {

        Address a = new Address("seoul");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "busan");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAddress) {
        System.out.println("changeAddress = " + changeAddress);
        address.setValue(changeAddress);
    }

}

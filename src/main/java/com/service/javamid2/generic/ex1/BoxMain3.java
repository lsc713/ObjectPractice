package com.service.javamid2.generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("10");
        stringBox.set("20");
        String s = stringBox.get();
        System.out.println(s);
    }

}

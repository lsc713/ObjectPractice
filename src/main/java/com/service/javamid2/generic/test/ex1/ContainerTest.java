package com.service.javamid2.generic.test.ex1;

public class ContainerTest {

    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>();
        System.out.println(stringContainer.isEmpty());

        stringContainer.setItem("data1");
        System.out.println(stringContainer.getItem());
        System.out.println(stringContainer.isEmpty());

        Container<Integer> integerContainer = new Container<>();
        integerContainer.setItem(10);
        System.out.println(integerContainer.getItem());

    }

}

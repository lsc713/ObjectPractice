package com.service.javamid.nested.test;

public class AnonymousMain {

    public static void main(String[] args) {
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("Hello World");
            }
        };

        hello.hello();
    }

}

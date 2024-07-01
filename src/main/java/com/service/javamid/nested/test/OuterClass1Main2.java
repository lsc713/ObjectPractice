package com.service.javamid.nested.test;

public class OuterClass1Main2 {

    public static void main(String[] args) {
        OuterClass2 outerClass1 = new OuterClass2();
        outerClass1.new InnerClass().hello();

    }

}

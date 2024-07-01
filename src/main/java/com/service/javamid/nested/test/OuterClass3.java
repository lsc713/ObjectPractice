package com.service.javamid.nested.test;

public class OuterClass3 {

    public void myMethod() {
        class InnerClass {
            public void hello() {
                System.out.println("hello");
            }
        }

        InnerClass innerClass = new InnerClass();
        innerClass.hello();
    }


}

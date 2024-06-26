package com.service.javamid.immutable;

public class Primitive {

    //기본형은 값을 복사해서 대입. 주소값을 가르키지 않는다
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}

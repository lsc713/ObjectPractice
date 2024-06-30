package com.service.javamid.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

    private int outInstannceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println(value);
                System.out.println(localVar);
                System.out.println(paramVar);
                System.out.println(outInstannceVar);
            }
        }
        LocalPrinter localPrinter = new LocalPrinter();
        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuterV1 = new LocalOuterV3();
        Printer process = localOuterV1.process(2);
        process.print();
        Field[] declaredFields = process.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
    }


}

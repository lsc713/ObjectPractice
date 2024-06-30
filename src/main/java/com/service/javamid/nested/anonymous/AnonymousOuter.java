
package com.service.javamid.nested.anonymous;

import com.service.javamid.nested.local.Printer;

public class AnonymousOuter {

    private int outInstannceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println(value);
                System.out.println(localVar);
                System.out.println(paramVar);
                System.out.println(outInstannceVar);
            }
        };
        printer.print();
        System.out.println("printer = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter localOuterV1 = new AnonymousOuter();
        localOuterV1.process(2);
    }


}

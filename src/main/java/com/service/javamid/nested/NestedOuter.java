package com.service.javamid.nested;

public class NestedOuter {
    private static int outClassVlaue = 3;
    private int outInstanceValue = 2;

    static class Nested{
        private int nextedInstanceValue =1;
        public void print() {
            System.out.println(nextedInstanceValue);

            System.out.println(outClassVlaue);
        }
    }

}

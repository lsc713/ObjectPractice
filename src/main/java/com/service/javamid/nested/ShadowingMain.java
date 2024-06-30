package com.service.javamid.nested;

public class ShadowingMain {

    public int value = 1;
    class Inner{
        public int value = 2;
        void go() {
            int value = 3;
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(ShadowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShadowingMain shadowingMain = new ShadowingMain();
        Inner inner = shadowingMain.new Inner();
        inner.go();
    }

}

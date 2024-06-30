package com.service.javamid.system;

public class SystemMain {

    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        System.out.println(currentTime);

        long currenTimeNano = System.nanoTime();
        System.out.println("currenTimeNano = " + currenTimeNano);

        System.out.println(System.getenv());
        System.out.println(System.getProperties());
    }

}

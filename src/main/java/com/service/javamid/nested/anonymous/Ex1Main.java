package com.service.javamid.nested.anonymous;

import java.util.Random;

public class Ex1Main {

    public static void helloDice() {
        System.out.println("Start");
        int randomDice = new Random().nextInt(6) + 1;
        System.out.println(randomDice);
        System.out.println("end");
    }

    public static void helloSum() {
        System.out.println("Start");
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        helloDice();
        helloSum();
    }

}

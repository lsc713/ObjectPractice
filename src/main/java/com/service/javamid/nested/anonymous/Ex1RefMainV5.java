package com.service.javamid.nested.anonymous;

import java.util.Random;

public class Ex1RefMainV5 {

    public static void hello(Process process) {
        System.out.println("Start");
        process.run();
        System.out.println("end");
    }



    public static void main(String[] args) {




        hello(() -> {
            int randomDice = new Random().nextInt(6) + 1;
            System.out.println(randomDice);
        });
        hello(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println(i);
            }
        });
    }

}

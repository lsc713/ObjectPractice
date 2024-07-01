package com.service.javamid.nested.anonymous;

import java.util.Random;

public class Ex1RefMainV1 {

    public static void hello(Process process) {
        System.out.println("Start");
        process.run();
        System.out.println("end");
    }

    static class Dice implements Process {
        @Override
        public void run() {
            int randomDice = new Random().nextInt(6) + 1;
            System.out.println(randomDice);
        }
    }

    static class Sum implements Process {


        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        hello(new Dice());
        hello(new Sum());
    }

}

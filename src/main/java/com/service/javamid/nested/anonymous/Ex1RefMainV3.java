package com.service.javamid.nested.anonymous;

import com.service.javamid.nested.anonymous.Ex1RefMainV1.Dice;
import com.service.javamid.nested.anonymous.Ex1RefMainV1.Sum;
import java.util.Random;

public class Ex1RefMainV3 {

    public static void hello(Process process) {
        System.out.println("Start");
        process.run();
        System.out.println("end");
    }



    public static void main(String[] args) {
        Process process = new Process() {
            @Override
            public void run() {
                int randomDice = new Random().nextInt(6) + 1;
                System.out.println(randomDice);
            }
        };

        Process process1 = new Process() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println(i);
                }
            }
        };

        hello(new Dice());
        hello(new Sum());
    }

}

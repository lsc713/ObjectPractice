package com.service.javamid.clazz.exception.ex3;

import java.util.Scanner;

public class MainV3 {

    public static void main(String[] args) {

        NetworkServiceV3_2 networkServiceV0 = new NetworkServiceV3_2();
//        NetworkServiceV3_1 networkServiceV0 = new NetworkServiceV3_1();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("message");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkServiceV0.sendMessage(input);
            System.out.println();
        }
        System.out.println("정상종료");
    }

}

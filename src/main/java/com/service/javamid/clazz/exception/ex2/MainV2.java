package com.service.javamid.clazz.exception.ex2;

import java.util.Scanner;

public class MainV2 {

    public static void main(String[] args) throws NetworkClientExceptionV3 {

        NetworkServiceV2_5 networkServiceV0 = new NetworkServiceV2_5();
//        NetworkServiceV2_4 networkServiceV0 = new NetworkServiceV2_4();
//        NetworkServiceV2_3 networkServiceV0 = new NetworkServiceV2_3();
//        NetworkServiceV2_2 networkServiceV0 = new NetworkServiceV2_2();
//        NetworkServiceV2_1 networkServiceV0 = new NetworkServiceV2_1();
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

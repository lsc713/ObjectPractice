package com.service.javamid.clazz.exception.ex0;

import java.util.Scanner;

public class MainV0 {

    public static void main(String[] args) {

        NetworkServiceV0 networkServiceV0 = new NetworkServiceV0();
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

package com.service.javamid.clazz.exception.ex4;

import com.service.javamid.clazz.exception.ex3.NetworkServiceV3_2;
import com.service.javamid.clazz.exception.ex4.exception.SendExceptionV4;
import java.util.Scanner;

public class MainV4 {

    public static void main(String[] args) {

        NetworkServiceV5 networkServiceV0 = new NetworkServiceV5();
//        NetworkServiceV4 networkServiceV0 = new NetworkServiceV4();
//        NetworkServiceV3_1 networkServiceV0 = new NetworkServiceV3_1();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("message");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            try {
                networkServiceV0.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("정상종료");
    }

    private static void exceptionHandler(Exception e) {

        e.printStackTrace(System.out);
        if (e instanceof SendExceptionV4 sendException) {
            System.out.println(sendException.getSendDate());
        }
    }

}

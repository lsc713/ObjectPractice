package com.service.javamid.clazz.exception.ex1;

import com.service.javamid.clazz.exception.ex0.NetworkServiceV0;
import java.util.Scanner;

public class MainV1 {

    public static void main(String[] args) {

//        NetworkServiceV1_1 networkServiceV0 = new NetworkServiceV1_1();
//        NetworkServiceV1_2 networkServiceV0 = new NetworkServiceV1_2();
        NetworkServiceV1_3 networkServiceV0 = new NetworkServiceV1_3();
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

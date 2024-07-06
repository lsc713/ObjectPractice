package com.service.javamid2.collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {

                break;
            }
            list.add(input);
        }

        int sum = 0;
        double average = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        average = sum / list.size();
        System.out.print("입력한 정수의 합계: " + sum);
        System.out.println();
        System.out.println("입력한 정수의 평균: " + average);

    }


}

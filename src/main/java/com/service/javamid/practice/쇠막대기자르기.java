package com.service.javamid.practice;

import java.util.Scanner;

class 쇠막대기자르기 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 1; t <= T; t++) {
            String s = in.next();
            int total =0;
            int stack =0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ')') {
                    stack--;
                    total++;
                } else if (s.charAt(i + 1) == ')') {
                    total += stack;
                    i++;
                } else {
                    stack++;
                }
            }
            System.out.println("#"+t+" "+total);
        }
    }
}

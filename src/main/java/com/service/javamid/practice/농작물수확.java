package com.service.javamid.practice;

import java.util.Scanner;

class 농작물수확 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T  = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            int[][] map = new int[n][n];
            for (int i = 0; i < n; i++) {
                String input = sc.next();
                for (int j = 0; j < n; j++) {
                    map[i][j] = input.charAt(j) - '0';
                }
            }
            int ans = 0;
            int start = n/2;
            int end = n/2;
            for (int i = 0; i < n; i++) {

                for (int j = start; j <= end; j++) {
                    ans += map[i][j];
                }
                if (i >= n / 2) {
                    start++;
                    end--;
                } else {
                    start--;
                    end++;
                }
//                System.out.println(start+""+end);

            }
            System.out.println("#"+t+" "+ans);
        }
    }
}

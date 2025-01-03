package com.service.javamid.practice;

import java.util.Scanner;

class 백만장자프로젝트 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int total =0;
            int idx = arr.length-1;
            for (int i = n-2; i >= 0; i--) {
                if (arr[i] <= arr[idx]) {
                    total += arr[idx]-arr[i];
                }else if (arr[i] > arr[idx]) {
                    idx = i;
                }
            }
            System.out.println("#"+t+" "+total);
        }
    }
}

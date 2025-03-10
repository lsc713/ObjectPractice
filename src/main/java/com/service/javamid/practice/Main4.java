package com.service.javamid.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main4 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++){
            arr[i] = arr[i-1]+Integer.parseInt(st.nextToken());
        }
        int max = -9999999;
        for (int i = k; i <= n; i++){
            int range = arr[i] - arr[i - k];
            if (max < range) {
                max = range;
            }
        }
        sb.append(max);
        System.out.println(sb);

    }
}
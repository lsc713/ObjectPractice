package com.service.javamid.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class 행렬제곱 {
    static int N;
    static int[][] matrix;
    static int MOD =1000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         N = Integer.parseInt(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken())%MOD;
            }
        }
        int[][] result = pow(matrix, B);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    private static int[][] pow(int[][] A, long exp) {
        if (exp == 1L) {
            return A;
        }
        int[][] half = pow(A, exp/2);
        int[][] result = multiply(half, half);
        if (exp % 2 == 1L) {
            result = multiply(result, A);
        }
        return result;
    }
    static int[][] multiply(int[][] A, int[][] B) {
        int[][] result = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    result[i][j] = (result[i][j] + (int) ((long) A[i][k] * B[k][j] % MOD)) % MOD;
                }
            }
        }
        return result;
    }
}
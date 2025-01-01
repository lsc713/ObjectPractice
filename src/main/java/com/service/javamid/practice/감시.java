package com.service.javamid.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 감시 {
    static class CCTV {
        int x, y, type;

        public CCTV(int x, int y, int type) {
            this.x = x;
            this.y = y;
            this.type = type;
        }
    }

    static int N, M, answer;
    static int[][] map;
    static List<CCTV> cctvs = new ArrayList<>();
    static int[] dx = {-1, 0, 1, 0}; // 상우하좌
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N][M];
        answer = 0;

        // 맵 입력 및 CCTV 위치 저장
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
                if(map[i][j] >= 1 && map[i][j] <= 5) {
                    cctvs.add(new CCTV(i, j, map[i][j]));
                }
                if(map[i][j] == 0) answer++;
            }
        }

        dfs(0, map);
        System.out.println(answer);
    }

    static void dfs(int depth, int[][] prevMap) {
        if(depth == cctvs.size()) {
            // 사각지대 계산
            int blindSpot = countBlindSpot(prevMap);
            answer = Math.min(answer, blindSpot);
            return;
        }

        CCTV cctv = cctvs.get(depth);
        int[][] temp = new int[N][M];

        // CCTV 종류별 감시 방향 설정
        switch(cctv.type) {
            case 1: // 한쪽 방향
                for(int dir = 0; dir < 4; dir++) {
                    copyMap(prevMap, temp);
                    watch(temp, cctv.x, cctv.y, dir);
                    dfs(depth + 1, temp);
                }
                break;

            case 2: // 양방향
                for(int dir = 0; dir < 2; dir++) {
                    copyMap(prevMap, temp);
                    watch(temp, cctv.x, cctv.y, dir);
                    watch(temp, cctv.x, cctv.y, dir + 2);
                    dfs(depth + 1, temp);
                }
                break;

            case 3: // 직각 방향
                for(int dir = 0; dir < 4; dir++) {
                    copyMap(prevMap, temp);
                    watch(temp, cctv.x, cctv.y, dir);
                    watch(temp, cctv.x, cctv.y, (dir + 1) % 4);
                    dfs(depth + 1, temp);
                }
                break;

            case 4: // 세 방향
                for(int dir = 0; dir < 4; dir++) {
                    copyMap(prevMap, temp);
                    watch(temp, cctv.x, cctv.y, dir);
                    watch(temp, cctv.x, cctv.y, (dir + 1) % 4);
                    watch(temp, cctv.x, cctv.y, (dir + 2) % 4);
                    dfs(depth + 1, temp);
                }
                break;

            case 5: // 네 방향
                copyMap(prevMap, temp);
                for(int dir = 0; dir < 4; dir++) {
                    watch(temp, cctv.x, cctv.y, dir);
                }
                dfs(depth + 1, temp);
                break;
        }
    }

    static void watch(int[][] map, int x, int y, int direction) {
        int nx = x;
        int ny = y;

        while(true) {
            nx += dx[direction];
            ny += dy[direction];

            if(nx < 0 || nx >= N || ny < 0 || ny >= M || map[nx][ny] == 6) break;
            if(map[nx][ny] == 0) map[nx][ny] = -1;
        }
    }

    static void copyMap(int[][] src, int[][] dst) {
        for(int i = 0; i < N; i++) {
            System.arraycopy(src[i], 0, dst[i], 0, M);
        }
    }

    static int countBlindSpot(int[][] map) {
        int count = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(map[i][j] == 0) count++;
            }
        }
        return count;
    }
}
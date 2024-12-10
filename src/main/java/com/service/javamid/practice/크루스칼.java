package com.service.javamid.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 크루스칼 {
    /*크루스칼에서 MST의 경우 시작 도착 가중치를 한번에 클래스로 지정.*/
    static class Position implements Comparable<Position> {
        int x;
        int y;
        int weight;
        public Position(int x, int y, int weight) {
            this.x=x;
            this.y = y;
            this.weight = weight;
        }
        @Override
        public int compareTo(Position o) {
            return Integer.compare(this.weight,o.weight);
        }
        @Override
        public String toString() {
            return "Position ["+"x= "+x+"y=" + y + ", weight=" + weight + "]";
        }
    }
    static int[] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int e = scanner.nextInt();
        arr = new int[v+1];
        for (int i = 1; i <= v; i++) {
            arr[i] = i;
        }
        //각 간선의 정점을 입력
        List<Position> positions = new ArrayList<>();
        for (int i = 1; i <= e; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            int weight = scanner.nextInt();
            positions.add(new Position(from, to, weight));
        }
        //각 간선에서 다음 간선까지의 가중치를 저장 후, 비용을 기준으로 정렬(최소비용)
        Collections.sort(positions);
        int sum=0;
        /*간선을 순회하며 연결되지않은(사이클이 생기지 않는 경우)--어차피 최소비용부터 나오기때문에.
        //이를 총합에 더함,
        //이후 해당 간선은 연결시켜 다음에는 합쳐지지 못하게 만듬.*/
        for(Position position : positions){
            if (findSet(position.x) != findSet(position.y)) {
                sum+=position.weight;
                union(position.x, position.y);
            }
        }
        System.out.println(sum);
    }
    static int findSet(int x){
        if(x!=arr[x]){
            arr[x] = findSet(arr[x]);//findset에서 자신이 주인이아니라면 주인을 찾으러가자
        }
        return arr[x];
    }
    static void union(int x,int y){
        arr[findSet(y)] = findSet(x);//y는 x를 주인으로 주인으로 삼는다.
    }
}

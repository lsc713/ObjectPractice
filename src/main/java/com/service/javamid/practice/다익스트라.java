package com.service.javamid.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 다익스트라 {

    static class Position implements Comparable<Position> {
        //각 간선에서 다음간선으로 가는 가중치를 위한 임시클래스
        int vertex,weight;
        public Position(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
        @Override
        public int compareTo(Position o) {
            return weight - o.weight;
        }
        @Override
        public String toString() {
            return vertex + ":" + weight;
        }
    }
    static int m,n;
    static List<Position>[] positions;
    static int[] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        positions = new ArrayList[n+1];
        //간선들의 연결을 저장하기 위한 리스트배열
        arr = new int[n+1];
        //각 간선의 최소거리 확인을 위한 배열.
        Arrays.fill(arr,Integer.MAX_VALUE);
        //초기화는 최댓값
        arr[1] = 0;
        //시작간선은 바로 갈 수 있으므로 0으로
        for (int i = 1; i <= n; i++) {
            positions[i] = new ArrayList<>();
        }
        //각 PositionList생성
        for (int i = 0; i < m; i++) {
            int from  = scanner.nextInt();
            int to = scanner.nextInt();
            int weight = scanner.nextInt();
            positions[from].add(new Position(to, weight));
            //from - to - weight를 집어넣어주자
        }
        //문제에서 요구하는 시작값을 기준으로 다익스트라
        dijkstra(1);
        System.out.println(Arrays.toString(arr));
    }
    static void dijkstra(int start){
        //우선순위큐생성, 시작값은 문제에서제시, 가중치는 0.
        /*우선순위큐를 돌며
         * 연결된 간선의 가중치가 최소가된다면 갱신,
         * 우선순위큐에 갱신된 정점을 삽입*/
        PriorityQueue<Position> pq = new PriorityQueue<>();
        pq.add(new Position(start,0));
        while (!pq.isEmpty()){
            Position p = pq.poll();
            int currentVertex = p.vertex;
            int currentCost = p.weight;
            for(Position nextPosition : positions[currentVertex]){
                if(arr[nextPosition.vertex]>nextPosition.weight+currentCost){
                    arr[nextPosition.vertex] = nextPosition.weight + currentCost;
                    pq.add(new Position(nextPosition.vertex,arr[nextPosition.vertex]));
                }
            }
        }
    }
}

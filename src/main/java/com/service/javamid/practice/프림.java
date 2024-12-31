package com.service.javamid.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 프림 {
    /*크루스칼에서 MST의 경우 시작 도착 가중치를 한번에 클래스로 지정.*/
    static class Position implements Comparable<Position> {
        int y;
        int weight;
        public Position( int y, int weight) {
            this.y = y;
            this.weight = weight;
        }
        @Override
        public int compareTo(Position o) {
            return Integer.compare(this.weight,o.weight);
        }
        @Override
        public String toString() {
            return "Position ["+"y=" + y + ", weight=" + weight + "]";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int e = scanner.nextInt();
        boolean[] visited = new boolean[v+1];
        List<Position>[] positions = new ArrayList[v+1];
        for (int i = 1; i <= v; i++) {
            positions[i] = new ArrayList<>();
        }

        for (int i = 1; i <= e; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            int weight = scanner.nextInt();
            positions[from].add(new Position(to, weight));
            positions[to].add(new Position(from, weight));
        }
        PriorityQueue<Position> pq = new PriorityQueue<>();
        pq.add(new Position(1,0));
        int sum=0;

        while (!pq.isEmpty()) {
            Position temp =pq.poll();
            int nextNode = temp.y;
            int weight = temp.weight;
            if(!visited[nextNode]){
                visited[nextNode] = true;
                sum+=weight;
                for(Position p : positions[nextNode]) {
                    if(visited[p.y])continue;
                    pq.add(new Position(p.y, p.weight));
                }
            }

        }
        System.out.println(sum);
    }

}

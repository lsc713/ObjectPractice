package com.service.javamid.practice;

import java.util.*;

class Main3{
    static class Fish implements Comparable<Fish>{
        int x,y,d,v;
        Fish(int x,int y,int d,int v){
            this.x = x;
            this.y = y;
            this.d = d;
            this.v = v;
        }
        @Override
        public int compareTo(Fish o) {
            return Integer.compare(this.v, o.v);
        }

        @Override
        public String toString() {
            return v+"";
        }
    }
    static int dx[] = {-1,-1,0,1,1,1,0,-1};//반시계
    static int[] dy= {0,-1,-1,-1,0,1,1,1};
    static int[][] map = new int[4][4];
    static List<Fish> fishs;
    static int sharkStack=0;
    static int[] shark;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        fishs = new ArrayList<>();
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                int tmp = scanner.nextInt();
                map[i][j] = tmp;
                fishs.add(new Fish(i,j,scanner.nextInt()-1,tmp));//x,y,direction,value
            }
        }
//        for (int[] ints : map) {
//            System.out.println(Arrays.toString(ints));
//        }
//        for (Fish ints : fishs) {
//            System.out.println(ints.toString());
//        }
        Fish tmp = fishs.get(0);
        shark = new int[]{0,0, tmp.d,map[0][0]};//x y direction(해당 맵에 있는 물고기의 방향)
        fishs.removeIf(fish->fish.v==map[0][0]);
        map[0][0]=-1;

//        System.out.println(Arrays.toString(shark));


        //fish move + shark 이동
        recur(map,fishs,shark);
        System.out.println(sharkStack);
    }

    private static void recur(int[][] map, List<Fish> fishs,int[] shark) {
        System.out.println(Arrays.toString(shark));
        if(sharkStack<shark[3]){
            sharkStack=shark[3];
        }
        //fish들 이동
        for (int i = 1 ;i<=fishs.size();i++){
            for (int j = 1 ;j<=fishs.size();j++){
                if (fishs.get(i-1).v == j){
                    move(fishs.get(i-1));
                }
            }
        }

        for(int i = 1 ; i <= 4 ; i++){//상어가 일직선으로 쭉쭉이동가능.
            int nx = shark[0]+dx[shark[2]]*i;
            int ny = shark[1]+dy[shark[2]]*i;
            if (0<=nx && 0<=ny && nx <4 && ny <4 && map[nx][ny] >0){
                int[][] copyMap = new int[4][4];
                for (int j = 0 ; j< 4;j++){
                    copyMap[j] = map[j].clone();
                }
                List<Fish> copyFishs = new ArrayList<>();
                fishs.forEach(e->copyFishs.add(new Fish(e.x,e.y,e.d,e.v)));


                Fish temp=null;
                for (int j=0;j<fishs.size();j++){
                    if(map[nx][ny] == fishs.get(j).v){
                        temp = fishs.get(j);
                    }
                }
                map[shark[0]][shark[1]] = 0;
                int[] newShark = new int[]{nx,ny,temp.d,shark[3]+map[nx][ny]};
                copyFishs.removeIf(fish->fish.v==map[nx][ny]);
                sharkStack+=copyMap[nx][ny];
                copyMap[nx][ny]=-1;
                recur(copyMap,copyFishs,newShark);
            }
        }
    }

    static void move(Fish fish){
        for (int i = 0 ; i<8;i++){
            if(isPromising(fish,i)) break;
        }
    }
    private static boolean isPromising(Fish fish,int idx) {
        int nx = fish.x+dx[(fish.d+idx)%8];
        int ny = fish.y+dy[(fish.d+idx)%8];
        if(0<=nx&&nx<4&&0<=ny&&ny<4&&map[nx][ny] != map[shark[0]][shark[1]]){
            int tmp =0;
            for(int i = 0 ;i<fishs.size();i++){
                if (fishs.get(i).v==map[nx][ny]){
                    Fish newFish = fishs.get(i);
                    newFish.x = fish.x;
                    newFish.y = fish.y;
                    tmp = newFish.d;
                    newFish.d = fish.d;
                    map[fish.x][fish.y]=newFish.v;
                    break;
                }
            }
            fish.x = nx;
            fish.y = ny;
            fish.d = tmp;
            map[nx][ny] = fish.v;
            //다른물고기도 바꿔야
            return true;
        }
        return false;
    }
}
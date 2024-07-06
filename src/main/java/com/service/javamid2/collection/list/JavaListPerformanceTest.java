package com.service.javamid2.collection.list;

import java.util.*;

public class JavaListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("==ArrayList 추가==");
        addFirst(new ArrayList<>(), size);
        addMid(new ArrayList<>(), size);

        ArrayList<Integer> arrayList = new ArrayList<>();
        addLast(arrayList, size);

        int loop = 1000;
        System.out.println("조회");
        getIndex(arrayList, loop,0);
        getIndex(arrayList, loop,size/2);
        getIndex(arrayList, loop,size-1);

        System.out.println("search");
        search(arrayList, loop,0);
        search(arrayList, loop,size/2);
        search(arrayList, loop,size-1);


        System.out.println("==LinkedList 추가==");
        addFirst(new LinkedList<>(), size);
        addMid(new LinkedList<>(), size);
        LinkedList<Integer> linkedList = new LinkedList<>();
        addLast(linkedList, size);

        System.out.println("조회");
        getIndex(linkedList, loop,0);
        getIndex(linkedList, loop,size/2);
        getIndex(linkedList, loop,size-1);

        System.out.println("search");
        search(linkedList, loop,0);
        search(linkedList, loop,size/2);
        search(linkedList, loop,size-1);



    }

    public static void addFirst(List<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {

            list.add(0,i);
        }
        long end = System.currentTimeMillis();

        System.out.println("크기:"+size + "계산 시간"+(end - start)+"ms");
    }

    public static void addMid(List<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {

            list.add(i/2,i);
        }
        long end = System.currentTimeMillis();

        System.out.println("크기:"+size + "계산 시간"+(end - start)+"ms");
    }

    public static void addLast(List<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {

            list.add(i);
        }
        long end = System.currentTimeMillis();

        System.out.println("크기:"+size + "계산 시간"+(end - start)+"ms");
    }

    private static void getIndex(List<Integer> list, int loop, int index) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long end = System.currentTimeMillis();
        System.out.println("index " + index + "loop" + loop + "시간" + (end - start) + "ms");
    }

    private static void search(List<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산시간: " + (endTime - startTime) + "ms");
    }
}

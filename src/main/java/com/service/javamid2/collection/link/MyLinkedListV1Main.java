package com.service.javamid2.collection.link;

import com.service.javamid2.collection.array.MyArrayListV1;
import java.util.ArrayList;

public class MyLinkedListV1Main {

    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();
        System.out.println("Add");
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        list.add("b");
        System.out.println(list);

        System.out.println("user method");
        System.out.println("list.size = " + list.size());
        //O(n)특정 위치의 데이터 조회
        System.out.println("list.get(1) = " + list.get(1));
        //O(n) 데이터 검색
        System.out.println("list.indexOf(\"c\") = " + list.indexOf("c"));
        //O(n)특정 위치의 데이터 삽입
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);
        list.add("f");
        new ArrayList<>();
    }

}

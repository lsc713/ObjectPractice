package com.service.javamid2.collection.array;

import java.util.Arrays;

public class ArrayMain1 {

    public static void main(String[] args) {

        int[] arr = new int[5];

        System.out.println("index input : O(1)");
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        System.out.println(Arrays.toString(arr));

        System.out.println("index change : O(1)");
        arr[2]=10;
        System.out.println(Arrays.toString(arr));

        System.out.println("index fetch O(1)");
        System.out.println(arr[2]);

        System.out.println("array search O(n)");
        int value = 10;
        for (int i : arr) {
            System.out.println(arr[i]);
            if (arr[i] == value) {
                System.out.println(value+"찾음");
                break;
            }
        }

        //인덱스를 찾는건 빠름, 근데 배열안에서 같은 값을 검색하는건 상대적으로 느림.
    }

}

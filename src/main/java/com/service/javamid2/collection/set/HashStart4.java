package com.service.javamid2.collection.set;

import java.util.Arrays;

public class HashStart4 {
    static final int CAPACITY = 10;
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 99);

        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 99;
        int hashIndex = hashIndex(searchValue);
        Integer result = inputArray[hashIndex];
        System.out.println(result);
    }

    private static void add(Integer[] inputArray, int value) {
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }

}

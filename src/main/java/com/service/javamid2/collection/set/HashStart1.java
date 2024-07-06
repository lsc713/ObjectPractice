package com.service.javamid2.collection.set;

import java.util.Arrays;

public class HashStart1 {

    public static void main(String[] args) {
        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 4;
        inputArray[2] = 3;
        inputArray[3] = 2;

        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 2;
        for (Integer i : inputArray) {
            if (i == searchValue) {
                System.out.println(i);
            }
        }
    }

}

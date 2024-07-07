package com.service.javamid2.collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ex1 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 10, 10};
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));
        for (Integer s : set) {
            System.out.println(s);
        }
    }

}

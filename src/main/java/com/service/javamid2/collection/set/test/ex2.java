package com.service.javamid2.collection.set.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ex2 {

    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new LinkedHashSet<>(List.of(3, 4, 5, 6, 7));
        Set<Integer> union = new HashSet<>();
        union.addAll(set1);
        union.addAll(set2);
        System.out.println(union);
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);
        union.removeAll(set2);
        System.out.println(union);


    }

}

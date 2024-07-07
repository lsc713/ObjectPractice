package com.service.javamid2.collection.map.test;

import java.util.HashMap;

public class WordFrequencyTest2 {

    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        String text = "orange orange apple apple";
        String[] words = text.split(" ");
        for (String word : words) {
            Integer count = map1.getOrDefault(word,0);
            map1.put(word, count);
        }
        System.out.println(map1);
    }

}

package com.service.javamid2.collection.map.test;

import java.util.HashMap;

public class WordFrequencyTest {

    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        String text = "orange orange apple apple";
        String[] words = text.split(" ");
        for (String word : words) {
            Integer count = map1.get(word);
            if (count == null) {
                count = 0;
            }
            count ++;
            map1.put(word, count);
        }
        System.out.println(map1);
    }

}

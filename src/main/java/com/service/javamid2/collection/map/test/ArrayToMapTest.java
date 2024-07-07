package com.service.javamid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {

    public static void main(String[] args) {

        String[][] produceArr = {{"java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        Map<String, Integer> productMap = new HashMap<>();
        for (String[] key : produceArr) {
            productMap.put(key[0], Integer.valueOf(key[1]));
        }

        for (String key : productMap.keySet()) {
            System.out.println(key + "|" + productMap.get(key));

        }
    }

}

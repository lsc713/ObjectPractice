package com.service.javamid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum2 {

    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        Map<String,Integer> map2 = Map.of("B",4,"C",5,"D",6);
        Map<String, Integer> result = new HashMap<>();

        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                result.put(key, map1.get(key) + map2.get(key));
            }
        }
        System.out.println(result);
    }

}

package com.service.javamid2.collection.map.test;

import java.util.HashMap;

public class CommonKeyValueSum1 {

    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("a", 1);
        map2.put("d", 5);
        map2.put("c", 6);

        HashMap<String, Integer> result = new HashMap<>();
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                result.put(key, map1.get(key) + map2.get(key));
            }
        }
        System.out.println(result);
    }

}

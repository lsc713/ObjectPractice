package com.service.javamid2.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMain1 {

    public static void main(String[] args) {

        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 70);
        studentMap.put("studentD", 60);
        System.out.println(studentMap);
        System.out.println(studentMap.get("studentA"));

        Set<Entry<String, Integer>> entries = studentMap.entrySet();
        for (Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+value);
        }
        System.out.println(studentMap.keySet());
        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.println(value);
        }

    }

}

package com.service.javamid2.collection.set;

public class MyHashSetV2Main1 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("AB");
        System.out.println(set);

        System.out.println("A".hashCode());
        System.out.println("B".hashCode());
        System.out.println("C".hashCode());
        System.out.println("AB".hashCode());

        String searchValue = "AB";
        boolean result = set.contains(searchValue);
        System.out.println(searchValue + result);
    }

}

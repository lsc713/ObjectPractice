package com.service.javamid2.collection.set;

public class MyHashSetV1Main {

    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(14);
        set.add(99);
        set.add(9);

        System.out.println(set);
        int searchValue = 9;
        boolean contains = set.contains(searchValue);
        System.out.println(searchValue + "(" + contains + ")");

        boolean removeResult = set.remove(searchValue);
        System.out.println(removeResult);
        System.out.println(set);
    }

}

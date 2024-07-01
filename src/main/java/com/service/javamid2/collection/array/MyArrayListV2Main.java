package com.service.javamid2.collection.array;

public class MyArrayListV2Main {

    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2();
        System.out.println("Add");
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        list.add("b");
        System.out.println(list);

        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println(list);
    }

}

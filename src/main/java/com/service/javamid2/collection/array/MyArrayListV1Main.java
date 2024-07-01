package com.service.javamid2.collection.array;

public class MyArrayListV1Main {

    public static void main(String[] args) {
        MyArrayListV1 list = new MyArrayListV1();
        System.out.println("Add");
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        list.add("b");
        System.out.println(list);

        System.out.println("user method");
        System.out.println("list.size = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf(\"c\") = " + list.indexOf("c"));

        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);
        list.add("f");
    }

}

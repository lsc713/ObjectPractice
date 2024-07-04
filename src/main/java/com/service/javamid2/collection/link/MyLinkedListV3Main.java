package com.service.javamid2.collection.link;

public class MyLinkedListV3Main {

    public static void main(String[] args) {
        MyLinkedListV3<String> list = new MyLinkedListV3<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        list.add(0, "d");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        MyLinkedListV3<Integer> list1 = new MyLinkedListV3<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);

        list1.add(0, 1);
        System.out.println(list1);
        list1.remove(0);
        System.out.println(list1);
    }

}

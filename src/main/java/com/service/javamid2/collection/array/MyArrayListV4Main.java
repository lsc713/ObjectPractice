package com.service.javamid2.collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> list = new MyArrayListV4();
        //마지막에 추가 //O(1)
        list.add("a");
        list.add("b");
        list.add("c");
        String string = list.get(0);
        System.out.println(string);

        MyArrayListV4<Integer> intList = new MyArrayListV4<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Integer integer = intList.get(0);
        System.out.println(integer);
    }
}

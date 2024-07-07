package com.service.javamid2.collection.set;

import com.service.javamid2.collection.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {

        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1 = " + obj1.hashCode());
        System.out.println("obj2 = " + obj2.hashCode());
        System.out.println(obj1);

        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println(i.hashCode());
        System.out.println(strA.hashCode());
        System.out.println(strAB.hashCode());

        System.out.println(Integer.valueOf(Integer.valueOf(-1).hashCode()));

        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        System.out.println(member1 == member2);
        System.out.println(member1.equals(member2));
        System.out.println(member1.hashCode());
        System.out.println(member2.hashCode());
    }

}

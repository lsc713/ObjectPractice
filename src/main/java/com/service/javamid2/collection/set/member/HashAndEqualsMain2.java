package com.service.javamid2.collection.set.member;

import com.service.javamid2.collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println(searchValue.hashCode());

        boolean contains = set.contains(searchValue);
        System.out.println(contains);
    }

}

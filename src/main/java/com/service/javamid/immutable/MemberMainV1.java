package com.service.javamid.immutable;

public class MemberMainV1 {

    public static void main(String[] args) {
        Address address = new Address("se");
        MemberV1 memberA = new MemberV1("회원1", address);
        MemberV1 memberB = new MemberV1("회원2", address);

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        memberB.getAddress().setValue("bu");


        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

    }

}

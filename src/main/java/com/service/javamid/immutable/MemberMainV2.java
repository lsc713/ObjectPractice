package com.service.javamid.immutable;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("se");
        MemberV2 memberA = new MemberV2("회원1", address);
        MemberV2 memberB = new MemberV2("회원2", address);

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        memberB.setAddress(new ImmutableAddress("bu"));
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);


    }

}

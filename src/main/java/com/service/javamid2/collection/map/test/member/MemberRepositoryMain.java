package com.service.javamid2.collection.map.test.member;

public class MemberRepositoryMain {

    public static void main(String[] args) {

        Member member = new Member("id1", "member1");
        Member member2 = new Member("id2", "member2");
        Member member3 = new Member("id3", "member3");

        MemberRepository repository = new MemberRepository();
        repository.save(member);
        repository.save(member2);
        repository.save(member3);

        Member findMember1 = repository.findById("id1");
        System.out.println(findMember1);

        repository.remove("id1");
    }

}

package com.service.javamid2.collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private Map<String, Member> memberMap = new HashMap<>();
    
    public void save(Member member) {
        memberMap.put(member.getId(), member);
    }


    public void remove(String id1) {
        memberMap.remove(id1);
    }

    public Member findById(String id1) {
        return memberMap.get(id1);
    }

    public Member findByName(String name) {
        for (Member mem : memberMap.values()) {
            if (mem.getName().equals(name)) {
                return mem;
            }
        }
        return null;
    }
}

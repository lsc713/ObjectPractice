package com.service.javamid.string;

public class StringImmutable {

    public static void main(String[] args) {

        String str = "he";
        String str2 = str.concat("llo");
        System.out.println("str = " + str);
        //String은 불변객체, 변수 선언 및 재할당을 통해 StringPool의 사이드이펙트를 제거
        System.out.println("str2 = " + str2);

    }
}

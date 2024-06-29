package com.service.javamid.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "test@example.com";
        String email1 = email.split("@")[0];
        String domain = email.split("@")[1];
        System.out.println(email1);
        System.out.println(domain);


    }

}

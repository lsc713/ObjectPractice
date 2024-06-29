package com.service.javamid.string.test;

public class TestString11 {

    public static void main(String[] args) {
        String fruits = "apple,banana,orange";
        StringBuilder sb = new StringBuilder();
        sb.append(fruits).reverse();
        System.out.println(sb);
    }

}

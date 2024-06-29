package com.service.javamid.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println(sb);

        sb.insert(4, "Java");
        System.out.println(sb);
        sb.delete(4, sb.length());
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        String string = sb.toString();
        System.out.println(string);

    }

}

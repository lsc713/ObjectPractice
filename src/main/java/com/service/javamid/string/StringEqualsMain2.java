package com.service.javamid.string;

public class StringEqualsMain2 {

    public static void main(String[] args) {

        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(isSame(str1, str2));;


        String str3 = "hello";
        String str4 = "hello";

        System.out.println(isSame(str3, str4));;

    }

    private static boolean isSame(String x, String y) {
        return x.equals(y);
//        return x == y;
    }

}

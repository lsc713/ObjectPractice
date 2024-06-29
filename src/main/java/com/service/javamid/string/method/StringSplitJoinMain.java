package com.service.javamid.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {

        String str = "Apple,Banana,Orange";
        String[] split = str.split(",");
        for (String s : split) {
            System.out.println(s);
        }

        String joinStr = "";
        for (String s : split) {
            joinStr += s + "-";
        }
        System.out.println(joinStr);

        String joined = String.join("-", "A", "B", "C");
        System.out.println(joined);

        String result = String.join("-", split);
        System.out.println(result);
    }

}

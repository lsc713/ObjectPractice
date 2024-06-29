package com.service.javamid.string.method;

public class StringUtilsMain1 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java";

        String numString = String.valueOf(num);
        System.out.println(numString);
        String boolString = String.valueOf(bool);
        System.out.println(boolString);
        String objString = String.valueOf(obj);
        System.out.println(objString);

        char[] strCharArray = str.toCharArray();
        System.out.println(strCharArray);
        for (char c : strCharArray) {
            System.out.print(c);
        }
    }

}

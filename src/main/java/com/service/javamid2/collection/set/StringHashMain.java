package com.service.javamid2.collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {

        char charA = 'A';
        char charB = 'B';
        System.out.println((int)charA);
        System.out.println((int) charB);

        System.out.println(hashCode("AB"));

        System.out.println(hashIndex(hashCode("A")));
        System.out.println(hashIndex(hashCode("AB")));
    }


    static int hashCode(String string) {
        char[] charArray = string.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}

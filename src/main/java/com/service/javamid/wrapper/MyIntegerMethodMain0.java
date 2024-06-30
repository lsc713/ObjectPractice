package com.service.javamid.wrapper;

public class MyIntegerMethodMain0 {

    public static void main(String[] args) {
        int value = 10;
        int li = compareTo(value, 5);
        int li2 = compareTo(value, 10);
        int li3 = compareTo(value, 15);
        System.out.println(li);
        System.out.println(li2);
        System.out.println(li3);

    }

    public static int compareTo(int value, int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

}

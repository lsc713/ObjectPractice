package com.service.javamid.wrapper;

public class MyIntegerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValye(intArr, -1));
        System.out.println(findValye(intArr, 0));
        System.out.println(findValye(intArr, -0100));
    }

    private static int findValye(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1;
    }

}

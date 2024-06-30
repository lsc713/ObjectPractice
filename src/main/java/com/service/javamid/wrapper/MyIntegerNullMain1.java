package com.service.javamid.wrapper;

public class MyIntegerNullMain1 {

    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(1), new MyInteger(2)};
        System.out.println(findValye(intArr, 2));
        System.out.println(findValye(intArr, 1));
        System.out.println(findValye(intArr, -0100));
    }

    private static MyInteger findValye(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null;
    }

}

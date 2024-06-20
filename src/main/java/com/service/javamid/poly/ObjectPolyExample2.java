package com.service.javamid.poly;

public class ObjectPolyExample2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object o = new Object();
        Object[] object = {dog,car,o};
        size(object);
    }

    private static void size(Object[] objects) {
        System.out.println("objects.length = " + objects.length);
    }

}

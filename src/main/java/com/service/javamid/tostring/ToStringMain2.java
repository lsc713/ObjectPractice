package com.service.javamid.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {

        Car modelY = new Car("Model Y");
        Dog dog1 = new Dog("dog1", 2);
        Dog dog2 = new Dog("dog2", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(modelY.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println내부에서 toString 호출");
        System.out.println(modelY);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. 오브젝트 다형성 활용");
        ObjectPrinter.print(modelY);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

    }

}

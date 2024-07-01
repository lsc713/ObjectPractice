package com.service.javamid2.generic.animal;

public class Cat extends Animal {


    public Cat(String name, int size) {
        super(name, size);
    }

    @Override
    public void sound() {
        System.out.println("mew");
    }
}

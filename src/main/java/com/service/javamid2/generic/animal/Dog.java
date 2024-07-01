package com.service.javamid2.generic.animal;

public class Dog extends Animal{

    public Dog(String name, int size) {
        super(name, size);
    }


    @Override
    public void sound() {
        System.out.println("Dog sound");
    }
}

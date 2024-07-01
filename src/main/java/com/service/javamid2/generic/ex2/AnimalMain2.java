package com.service.javamid2.generic.ex2;

import com.service.javamid2.generic.animal.Animal;
import com.service.javamid2.generic.animal.Cat;
import com.service.javamid2.generic.animal.Dog;

public class AnimalMain2 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("dog", 100);
        Cat cat = new Cat("mew", 50);
        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat);

        Animal findAnimal = animalBox.get();
        System.out.println(findAnimal);
    }

}

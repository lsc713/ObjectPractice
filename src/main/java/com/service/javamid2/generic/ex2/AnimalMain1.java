package com.service.javamid2.generic.ex2;

import com.service.javamid2.generic.animal.Animal;
import com.service.javamid2.generic.animal.Cat;
import com.service.javamid2.generic.animal.Dog;

public class AnimalMain1 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("dog", 100);
        Cat cat = new Cat("mew", 50);
        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);

        Dog findDog = dogBox.get();
        System.out.println(findDog);


        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat findCat = catBox.get();
        System.out.println(findCat);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        Animal findAnimal = animalBox.get();
        System.out.println(findAnimal);
    }

}

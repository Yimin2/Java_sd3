package com.ll.d.inheritance.pratice2.animal;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = {new Lion("사자", 6), new Elephant("코끼리", 6), new Monkey("원숭이", 6)};
        feedingTime(animals);
    }

    static void feedingTime(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

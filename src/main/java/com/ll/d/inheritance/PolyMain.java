package com.ll.d.inheritance;

public class PolyMain {
    public static void main(String[] args) {
        //        Dog3 d = new Dog3();
        //        Cat3 c = new Cat3();
        //        Bird3 b = new Bird3();
        Animal3 a1 = new Dog3();
        Animal3 a2 = new Cat3();
        Animal3 a3 = new Bird3();
        Animal3 a4 = new Rabbit3();
        Animal3 a5 = new Cat3();

        //        a1.makeSound();
        //        a2.makeSound();
        //        a3.makeSound();
        soundAnimal(a1);

        soundAnimal(a2);

        soundAnimal(a3);

        soundAnimal(a4);
    }

    static void soundAnimal(Animal3 animal3) {
        animal3.makeSound();
    }
}

class Animal3 {
    void makeSound() {
        System.out.println("소리냄");
    }
}

class Dog3 extends Animal3 {
    @Override
    void makeSound() {
        System.out.println("멍멍");
    }
    void bark() {
        System.out.println("왈왈");
    }
}

class Cat3 extends Animal3 {
    @Override
    void makeSound() {
        System.out.println("야옹");
    }

    void meow() {
        System.out.println("미야옹");
    }
}

class Bird3 extends Animal3 {
    @Override
    void makeSound() {
        System.out.println("짹짹");
    }
}

class Rabbit3 extends Animal3 {
    @Override
    void makeSound() {
        System.out.println("깡총");
    }
}

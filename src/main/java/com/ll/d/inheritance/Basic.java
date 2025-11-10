package com.ll.d.inheritance;

public class Basic {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}

class Animal {
    private String name;
    private int age;

    void eat() {
        System.out.println("eat");
    }
}


class Dog extends Animal {
//    String name;
//    int age;
//
//    void eat() {
//        System.out.println("eat");
//    }
    private String breed;

    void bark() {
        System.out.println("bark");
    }
}

class Cat extends Animal {
//    private String name;
//    private int age;
//
//    void eat() {
//        System.out.println("eat");
//    }
    private int life;

    void meow() {
        System.out.println("meow");
    }
}


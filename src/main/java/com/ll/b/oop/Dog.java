package com.ll.b.oop;

public class Dog {
    int age;
    String name;
    String breed;

    void bark() {
        System.out.println("왈왈");
    }

    public Dog (int age, String name, String breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }
}

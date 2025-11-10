package com.ll.d.inheritance.pratice2.animal;

public class Monkey extends Animal{
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("끼끼");
    }
}

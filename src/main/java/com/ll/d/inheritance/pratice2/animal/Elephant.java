package com.ll.d.inheritance.pratice2.animal;

public class Elephant extends Animal{
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("뿌우우");
    }
}

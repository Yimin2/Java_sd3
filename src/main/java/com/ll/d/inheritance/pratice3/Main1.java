package com.ll.d.inheritance.pratice3;

import lombok.AllArgsConstructor;

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }

    @Override
    public void eat() {
        System.out.println("사료를 먹습니다");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("야옹");
    }

    @Override
    public void eat() {
        System.out.println("생선을 먹습니다");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("짹짹");
    }

    @Override
    public void eat() {
        System.out.println("모이를 먹습니다.");
    }
}

@AllArgsConstructor
abstract class Animal {
    protected String name;
    protected int age;

    public void displayInfo() {
        System.out.println(name + age);
    }

    public abstract void makeSound();
    public abstract void eat();
}

public class Main1 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("바둑이", 3), new Cat("나비", 2), new Bird("짹짹이", 1)};

        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
            animal.eat();
            System.out.println();
        }
    }
}

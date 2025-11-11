package com.ll.d.inheritance.pratice4;


import lombok.AllArgsConstructor;

interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}

@AllArgsConstructor
class Duck implements Swimmable, Flyable {
    private String name;

    @Override
    public void fly() {
        System.out.println(name + "날라감");
    }

    @Override
    public void swim() {
        System.out.println(name + "수영");
    }
}

@AllArgsConstructor
class Fish implements Swimmable {
    private String name;

    @Override
    public void swim() {
        System.out.println(name + "수영");
    }
}

@AllArgsConstructor
class Bird implements Flyable {
    private String name;

    @Override
    public void fly() {
        System.out.println(name + "날라감");
    }
}

public class Practice6 {
    public static void main(String[] args) {
        Duck duck = new Duck("오리");
        duck.swim();
        duck.fly();
        System.out.println();

        Fish fish = new Fish("물고기");
        fish.swim();
        System.out.println();

        Bird bird = new Bird("참새");
        bird.fly();
    }
}

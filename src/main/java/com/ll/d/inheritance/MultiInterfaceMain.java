package com.ll.d.inheritance;

interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}
interface Walkable {
    void walk();
}

class Animal7 {
    void eat() {
        System.out.println("eating");
    }
}

class Duck implements Swimmable, Flyable, Walkable{
    @Override
    public void fly() {
        System.out.println("날아댕김");
    }

    @Override
    public void swim() {
        System.out.println("헤엄");
    }

    @Override
    public void walk() {
        System.out.println("오리 걸음");
    }
}

 class Fish extends Animal7 implements Swimmable {
     @Override
     public void swim() {
         System.out.println("헤엄");
     }
 }

public class MultiInterfaceMain {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Fish fish = new Fish();
    }
}

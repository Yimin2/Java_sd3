package com.ll.d.inheritance;

import lombok.AllArgsConstructor;

abstract class Animal5 {
    abstract void run();

    abstract void sleep();

    abstract void eat();
}

class Dog5 extends Animal5 {
    @Override
    void run() {

    }

    @Override
    void sleep() {

    }

    @Override
    void eat() {

    }
}

interface Animal6 {
    void run();

    void sleep();

    void eat();
}

@AllArgsConstructor
class Rectangle5 implements Drawable {
    private int width, height;

    @Override
    public void draw() {
        System.out.println("사각형 그리기");
    }
}

interface Drawable {
    void draw();
}

class Dog6 implements Animal6 {
    @Override
    public void run() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {

    }
}

public class InterfaceMain {
    public static void main(String[] args) {

    }
}

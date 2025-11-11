package com.ll.d.inheritance;

import lombok.AllArgsConstructor;

@AllArgsConstructor
abstract class Animal4 {
    String name;

    void sleep() {
        System.out.println("sleeping");
    }

    abstract void makeSound();
}

@AllArgsConstructor
abstract class Shape4 {
    String color;

    void displayColor() {
        System.out.println(color);
    }

    abstract double getArea();
    abstract double getPerimeter();
}

abstract class ShapeChild4 extends  Shape4 {
    public ShapeChild4(String color) {
        super(color);
    }
}

class Circle4 extends Shape4 {
    double radius;

    public Circle4(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 3.14 * radius * 2;
    }
}

class Rectangle4 extends Shape4 {
    double heigh;
    double width;

    public Rectangle4(String color, double heigh, double width) {
        super(color);
        this.heigh = heigh;
        this.width = width;
    }

    @Override
    double getArea() {
        return heigh*width;
    }

    @Override
    double getPerimeter() {
        return heigh*2 + width*2;
    }
}

abstract class Vehicle4 {
    abstract void start();
    abstract void stop();
    abstract int getSpeed();
}

class Car4 extends Vehicle4 {
    int speed;

    @Override
    void start() {
        speed = 30;
        System.out.println("자동차 출발");
    }

    @Override
    void stop() {
        speed = 0;
        System.out.println("자동차 멈춤");
    }

    @Override
    int getSpeed() {
        return speed;
    }
}

class Bicycle4 extends  Vehicle4 {
    int speed;

    @Override
    void start() {
        speed = 10;
        System.out.println("자전거 출발");
    }

    @Override
    void stop() {
        speed = 00;
        System.out.println("자전거 멈춤");
    }

    @Override
    int getSpeed() {
        return speed;
    }
}

public class AbstractMain {
    public static void main(String[] args) {
        Shape4 circle4 = new Circle4("red", 4);
        Shape4 rectangle4 = new Rectangle4("blue", 10, 10);

        circle4.displayColor();
        rectangle4.displayColor();
        System.out.println(circle4.getArea());
        System.out.println(rectangle4.getArea());
    }
}

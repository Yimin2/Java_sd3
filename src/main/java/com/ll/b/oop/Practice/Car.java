package com.ll.b.oop.Practice;

public class Car {
    String model;
    int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public void accelerate() {
        speed += 10;
    }

    public void brake() {
        speed -= 10;
    }

    public void printInfo() {
        System.out.printf("모델:%s, 속도: %d\n",model,speed);
    }
}

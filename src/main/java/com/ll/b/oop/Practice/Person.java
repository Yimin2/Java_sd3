package com.ll.b.oop.Practice;

public class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void printInfo() {
        System.out.printf("이름: %s, 나이: %d\n", name, age);
    }
}

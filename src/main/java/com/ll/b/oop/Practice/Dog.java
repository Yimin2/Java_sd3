package com.ll.b.oop.Practice;

public class Dog {
    String name;
    String breed;

    public Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public void sit() {
        System.out.printf("%s %s가 앉았습니다.\n",breed,name);
    }

    public void hand() {
        System.out.printf("%s %s가 앉았습니다.\n",breed,name);
    }
}

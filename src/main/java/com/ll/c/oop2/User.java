package com.ll.c.oop2;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        setUserAge(age);
    }

    public String getUsername() {
        return name;
    }

    public int getUserAge() {
        return age;
    }

    public void setUsername(String name) {
        this.name = name;
    }

    public void setUserAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("!!!!");
        } else {
            this.age = age;
        }
    }
}

package com.ll.d.inheritance.pratice.person;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Person {
    //Person 클래스: name, age 필드와 introduce() 메서드
    String name;
    int age;

    void introduce() {
        System.out.println(name + age);
    }
}

package com.ll.d.inheritance.pratice2.animal;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Animal {
    String name;
    int age;

    void makeSound() {
        System.out.println("울음소리");
    }
}



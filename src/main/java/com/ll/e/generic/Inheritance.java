package com.ll.e.generic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
class Parent<T> {
    private T value;
}

class Child<T> extends Parent<T> {
    public Child(T value) {
        super(value);
    }
}

class StringChild extends Parent<String> {
    public StringChild(String value) {
        super(value);
    }
}

class ExtendedChild<T, U> extends Parent<T> {
    private U additionalValue;

    public ExtendedChild(T value, U additionalValue) {
        super(value);
        this.additionalValue = additionalValue;
    }

    public U getAdditionalValue() {
        return additionalValue;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Parent<String> p1 = new Parent<String>("hello");
        Child<String> c1 = new Child<String>("hi");
        StringChild sc1 = new StringChild("hihi");
        ExtendedChild<String, Integer> ec1 = new ExtendedChild<>("kim", 12);
    }
}

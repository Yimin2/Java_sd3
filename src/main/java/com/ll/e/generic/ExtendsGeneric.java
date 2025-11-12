package com.ll.e.generic;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
class NumberBox<T extends Number>{
    private T value;

    public double getDoubleValue() {
        return value.doubleValue();
    }
}

@AllArgsConstructor
class SortedBox<T extends Comparable<T>> {
    private T value;

    public boolean isGreaterThan(T other) {
        return value.compareTo(other) > 0;
    }
}

public class ExtendsGeneric {
    public static void main(String[] args) {
        NumberBox<Integer> nb1 = new NumberBox<>(10);
        int i = nb1.getValue();

        NumberBox<Double> nb2 = new NumberBox<>(3.14);
        double d = nb2.getValue();

        System.out.println(nb1.getDoubleValue());

        SortedBox<Integer> b1 = new SortedBox<>(10);
        System.out.println(b1.isGreaterThan(5));
    }
}

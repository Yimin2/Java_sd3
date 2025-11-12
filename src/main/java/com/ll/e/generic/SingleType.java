package com.ll.e.generic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
class Container<T> {
    private T value;
}

public class SingleType {
    public static void main(String[] args) {
        Container<String> c1 = new Container<String>("hello");
        System.out.println(c1.getValue());

        Container<Integer> c2 = new Container<Integer>(123);
        System.out.println(c2.getValue());
    }
}

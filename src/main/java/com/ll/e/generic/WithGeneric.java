package com.ll.e.generic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Box2<T> {
    private T item;
}

public class WithGeneric {
    public static void main(String[] args) {
        Box2<String> b1 = new Box2<String>();
        Box2<Integer> b2 = new Box2<Integer>();

        b1.setItem("hello");
        b2.setItem(123);

        String str = b1.getItem();
        int i = b2.getItem();
    }
}

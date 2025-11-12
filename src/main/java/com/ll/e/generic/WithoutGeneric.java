package com.ll.e.generic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Box {
    private Object item;
}

@Getter
@Setter
class StringBox {
    private String item;
}

public class WithoutGeneric {
    public static void main(String[] args) {
        Box box = new Box();
        box.setItem("hello");
        System.out.println(box.getItem());

        String str = (String) box.getItem();
        System.out.println(str);

        box.setItem(123);
        System.out.println(box.getItem());

        StringBox stringBox = new StringBox();
        stringBox.setItem("hello");
    }
}

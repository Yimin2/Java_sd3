package com.ll.d.inheritance;

import java.util.Objects;

public class ObjectMain {
    public static void main(String[] args) {
        MyObject myObject = new MyObject("test", 100);
        System.out.println(myObject.toString());
        System.out.println(myObject);

        MyObject myObject1 = new MyObject("test", 100);
        System.out.println(myObject.equals(myObject1));
    }
}

class MyObject {
    String name;
    int value;

    public MyObject(String name, int value) {
        this.name = name;
        this.value = value;
    }

//    @Override
//    public String toString() {
//        return ("name = " + name + " value = " + value);
//    }

    @Override
    public String toString() {
        return "MyObject{" + "name='" + name + '\'' + ", value=" + value + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MyObject myObject = (MyObject) o;
        return value == myObject.value && Objects.equals(name, myObject.name);

    }
}



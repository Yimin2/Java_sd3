package com.ll.d.inheritance;

public class OverridingMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}

class Parent {
    void show() {
        System.out.println("parent");
    }

    final void display() {
        System.out.println("child display");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("child");
    }
    //    override 불가
    //    @Override
    //    void display() {
    //        System.out.println("child display");
    //    }
}

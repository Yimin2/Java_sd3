package com.ll.c.oop2;

public class AccessModifier {
    public static void main(String[] args) {
    PrivateClass pc = new PrivateClass(10);
    System.out.println(pc.getValue());
    pc.setValue(5);
    System.out.println(pc.getValue());

    }
}

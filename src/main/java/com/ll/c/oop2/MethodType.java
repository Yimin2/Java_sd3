package com.ll.c.oop2;

public class MethodType {
    public static void main(String[] args) {
        MethodType methodType = new MethodType();
        methodType.instanceMethod();
        staticMethod();
    }

    int instanceField = 10;
    static int staticField = 20;

    void instanceMethod() {
        System.out.println("인스턴스 메서드");
        System.out.println(instanceField);
        System.out.println(staticField);
    }

    static void staticMethod() {
        System.out.println("스태틱 메서드");
        // System.out.println(instanceField); 불가
        System.out.println(staticField);
    }
}

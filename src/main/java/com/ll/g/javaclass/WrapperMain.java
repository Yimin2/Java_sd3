package com.ll.g.javaclass;

public class WrapperMain {
    public static void main(String[] args) {
        int primitive = 10;
        Integer wrapper = Integer.valueOf(primitive); // Boxing
        System.out.println(wrapper);

        Integer wrapper2 = Integer.valueOf(20);
        int primitive2 = wrapper2; // unBoxing
        System.out.println(primitive2);

        Integer wrapper3 = 10; //Auto Boxing
        int primitive3 = wrapper3; //Auto UnBoxing

        Integer w = null; // class 여서 ok
        // int v = w; 아니라서 x

        int parsed = Integer.parseInt("123");

        Integer a = 10;
        Integer b = 20;
        System.out.println(a.compareTo(b));
    }
}

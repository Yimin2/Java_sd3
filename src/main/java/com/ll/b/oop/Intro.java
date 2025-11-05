package com.ll.b.oop;

public class Intro {
    public static void main(String[] args) {
        System.out.println(calculateRectangleArea(100, 200));
        System.out.println(calculateRectangleArea(200, 200));
        System.out.println(calculateRectangleArea(300, 200));
    }

    private static int calculateRectangleArea(int width, int height) {
        return width * height;
    }


}

package com.ll.d.inheritance.pratice4;

import lombok.AllArgsConstructor;

interface  Drawable {
    void draw();
}

@AllArgsConstructor
class Circle6 implements Drawable {
    private  int radius;

    @Override
    public void draw() {
        System.out.println("반지름" + radius + "인 원을 그립니다");
    }
}


@AllArgsConstructor
class Rectangle6 implements Drawable {
    private int width, height;

    @Override
    public void draw() {
        System.out.println(width + "*"+ height + "사각형을 그립니다");
    }
}

@AllArgsConstructor
class Triangle6 implements Drawable{
    private int base, height;

    @Override
    public void draw() {
        System.out.println(base+"밑변" + height + "높이" + "삼각형을 그립니다");
    }
}

public class Practice4 {
    public static void main(String[] args) {
        Drawable[] shapes = {new Circle6(5), new Rectangle6(4, 6), new Triangle6(3, 4)};

        for (Drawable shape : shapes) {
            shape.draw();
        }
    }
}

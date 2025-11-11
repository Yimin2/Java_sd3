package com.ll.d.inheritance;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class ShapeMain {
    public static void main(String[] args) {
        Circle4 c = new Circle4("red", 10);
        Rectangle r = new Rectangle("blue", 10, 10);

        System.out.println(c.getArea());
        System.out.println(r.getArea());

    }
}

@NoArgsConstructor
@AllArgsConstructor
class Shape {
    String color;

    double getArea() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }
}


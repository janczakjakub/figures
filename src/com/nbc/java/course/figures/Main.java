package com.nbc.java.course.figures;

public class Main {
    public static void main(String... args) {
        Rectangle rectangle = new Rectangle(2, 4);
        Square square = new Square(5);
        Triangle triangle = new Triangle(2,2,2);

        System.out.println(rectangle.toString());
        System.out.println(square.toString());
        System.out.println(triangle.toString());
    }
}


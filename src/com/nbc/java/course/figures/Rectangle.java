package com.nbc.java.course.figures;

public class Rectangle extends Shape {

    private String name;

    public Rectangle(int sideA, int sideB) {
        super(new int[]{sideA, sideB});
        this.name = "Rectangle";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "This is " + this.getName() + ", it has area " + this.getArea() + " and his sum of side lengths is " + this.getSumSideLengths() + ". His parent is " + super.getName();
    }

    public int getSumSideLengths() {
        int sumSides = 0;
        for (int i = 0; i < this.getSideLengths().length; i++) {
            sumSides += this.getSideLengths()[i];
        }
        return 2*sumSides;
    }

    public int getArea() {
        return this.getSideLengths()[0] * this.getSideLengths()[1];
    }
}

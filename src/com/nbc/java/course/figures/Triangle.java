package com.nbc.java.course.figures;

public class Triangle extends Shape{
    private String name;

    public Triangle(int sideA, int sideB, int sideC) {
        super(new int[]{sideA, sideB, sideC});
        this.name = "Rectangle";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "This is " + this.getName() + ", it has area " + this.getArea() + " and his sum of side lengths is " + this.getSumSideLengths()
                + ". His parent is " + super.getName();
    }

    public int getSumSideLengths() {
        return this.getSideLengths()[0] + this.getSideLengths()[1] + this.getSideLengths()[2];
    }

    public int getArea() {
        int halfOfSumSideLengths = this.getSumSideLengths()/2;
        return (int)Math.sqrt(halfOfSumSideLengths * (halfOfSumSideLengths - this.getSideLengths()[0]) * (halfOfSumSideLengths - this.getSideLengths()[1]) * (halfOfSumSideLengths - this.getSideLengths()[0]));
    }

}

package com.nbc.java.course.figures;

public class Square extends Rectangle {

    private String name;

    Square(int side) {
        super(side, side);
        this.name = "Square";
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

    public void aboutSquare() {
        System.out.println("The Square has the same sides");
    }

}

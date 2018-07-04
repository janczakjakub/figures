package com.nbc.java.course.figures;

public abstract class Shape implements FiguresInterface {

    private String name;
    private int[] sideLengths;

    public Shape(int[] sideLengths) {
        this.name = "Shape";
        this.sideLengths = sideLengths;
    }

    public String getName() {
        return this.name;
    }

    public int[] getSideLengths() {
        return this.sideLengths;
    }

    public abstract int getSumSideLengths();

}

package com.naila.chapter13.AbstractClassesAndInterfaces.Exercises.Exercises_13_10;

import com.naila.chapter13.AbstractClassesAndInterfaces.Exercises.Exercises_13_07.GeometricObject2;

public class Rectangle1 extends GeometricObject2 implements  Comparable<Rectangle1> {
    private double width;
    private double height;

    public Rectangle1() {
    }
    public Rectangle1(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle1(
            double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width * height);
    }
    @Override
    public int compareTo(Rectangle1 o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }
    @Override
    public boolean equals(Object o) {
        return this.compareTo((Rectangle1) o) == 0;
    }
    @Override
    public String toString() {
        return super.toString() + "\nWidth: " + width + "\nHeight: " + height +
                "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}

package com.naila.chapter13.AbstractClassesAndInterfaces.Exercises.Exercises_13_06;

import com.naila.chapter13.AbstractClassesAndInterfaces.Exercises.Exercises_13_05.GeometricObject_;

public class Circle extends GeometricObject1 {
    private double radius;

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return radius * radius *Math.PI;
    }
    public double getDiameter() {
        return 2 * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString() {
        return super.toString() + "\nRadius: " + radius + "\nArea: " + getArea() +
                "\nDiameter: " + getDiameter() + "\nPerimeter: " + getPerimeter();
    }
}


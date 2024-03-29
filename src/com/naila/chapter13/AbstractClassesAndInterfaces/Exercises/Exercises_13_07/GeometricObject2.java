package com.naila.chapter13.AbstractClassesAndInterfaces.Exercises.Exercises_13_07;

public abstract class GeometricObject2 {
    private String color = "while";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject2() {
        dateCreated = new java.util.Date();
    }
    protected GeometricObject2(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}

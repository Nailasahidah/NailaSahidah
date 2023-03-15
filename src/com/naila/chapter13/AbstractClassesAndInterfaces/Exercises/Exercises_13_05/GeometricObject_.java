package com.naila.chapter13.AbstractClassesAndInterfaces.Exercises.Exercises_13_05;

public abstract class GeometricObject_ implements Comparable<GeometricObject_> {
    private String color = "while";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject_() {
        dateCreated = new java.util.Date();
    }
    protected GeometricObject_(String color, boolean filled) {
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
    @Override
    public int compareTo(GeometricObject_ o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() > o.getArea())
            return -1;
        else
            return 0;
    }
    public static GeometricObject_ max(GeometricObject_ o1, GeometricObject_ o2) {
        return o1.compareTo(o2) == 1? o1 : o2;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}

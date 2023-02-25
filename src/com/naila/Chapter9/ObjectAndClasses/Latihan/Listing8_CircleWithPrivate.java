package com.naila.Chapter9.ObjectAndClasses.Latihan;

public class Listing8_CircleWithPrivate {
    private double radius = 1;
    private static int numberOfObjects = 0;

    public void Circle() {
        numberOfObjects++;
    }
    public void Circle (double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
}

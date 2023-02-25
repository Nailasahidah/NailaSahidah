package com.naila.Chapter9.ObjectAndClasses.Latihan;

public class Listing6_Circle {
    double radius;
    static int numberOfObjects = 0;
    Listing6_Circle() {
        radius = 1;
        numberOfObjects++;
    }
    Listing6_Circle(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    static int getNumberOfObjects() {
        return numberOfObjects;
    }
    double getArea() {
        return radius * radius * Math.PI;
    }
}

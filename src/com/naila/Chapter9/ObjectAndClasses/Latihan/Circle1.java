package com.naila.Chapter9.ObjectAndClasses.Latihan;

public class Circle1 {
    double radius;

    static int numberOfObjects = 0;

    Circle1() {
        radius = 1;
        numberOfObjects++;
    }
    Circle1(double newRadius) {
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

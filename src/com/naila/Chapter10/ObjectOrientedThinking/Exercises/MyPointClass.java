package com.naila.Chapter10.ObjectOrientedThinking.Exercises;

public class MyPointClass {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);

        System.out.println("The distance between ("
                + point1.getX() + ", " + point1.getY() + ") and ("
                + point2.getX() + ", " + point2.getY() + ") is: " +
                point1.distance(point2));
    }
}

/*
The distance between (0.0, 0.0) and (10.0, 30.5) is: 32.09750769140807
 */
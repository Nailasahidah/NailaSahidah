package com.naila.chapter3.Selections.Exercises;

import java.util.Scanner;

public class Soal27PointsInTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double intersectx = (-x * (200 * 100)) / (-y * 200 - x * 100);
        double intersecty = (-y * (200 * 100)) / (-y * 200 - x * 100);
        System.out.println("The point " + ((x > intersectx || y > intersecty)
                ? "is not " : "is " ) + "in the triangle");
    }
}


/*
(Geometry: points in triangle?) Suppose a right triangle is placed in a plane as
shown below. The right-angle point is placed at (0, 0), and the other two points
are placed at (200, 0) and (0, 100). Write a program that prompts the user to enter
a point with x- and y-coordinates and determines whether the point is inside the
triangle. Here are the sample runs:

Enter a point’s x- and y-coordinates: 100.5 25.5
The point is in the triangle

Enter a point’s x- and y-coordinates: 100.5 50.5
The point is not in the triangle
 */
package com.naila.chapter3.Selections.Exercises;

import java.util.Scanner;

public class Soal34PointOnLineSegment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        boolean online =
                !(((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0 ||
                        ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) < 0 ||
                        (x2 < x0) || (y2 < y0) || (x2 > x1) || (y2 > y1));
        System.out.print("(" + x2 + ", " + y2 + ") is ");
        if (!online)
            System.out.print("not ");
        System.out.println("on the line segment from (" + x0 + ", " + y0 +
                ") to (" + x1 + ", " + y1 + ")");
    }
}


/*
(Geometry: point on line segment) Exercise 3.32 shows how to test whether a
point is on an unbounded line. Revise Exercise 3.32 to test whether a point is on
a line segment. Write a program that prompts the user to enter the three points for
p0, p1, and p2 and displays whether p2 is on the line segment from p0 to p1. Here
are some sample runs:

Enter three points for p0, p1, and p2: 1 1 2.5 2.5 1.5 1.5
(1.5, 1.5) is on the line segment from (1.0, 1.0) to (2.5, 2.5)

Enter three points for p0, p1, and p2: 1 1 2 2 3.5 3.5
(3.5, 3.5) is not on the line segment from (1.0, 1.0) to (2.0, 2.0)
 */
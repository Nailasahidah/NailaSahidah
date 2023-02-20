package com.naila.Chapter8.MultidimensionalArrays.Exercises;

import java.util.Scanner;

public class Ex8_AllClosestPairsOfPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter the number of points : ");
        int numberOfPoints = input.nextInt();

        double[][] points = new double[numberOfPoints][2];
        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        int p1 = 0, p2 = 1;
        double shortestDistance = distance(points[p1][0], points[p1][1],
                points[p2][0], points[p2][p1]);

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1],
                        points[j][0], points[j][1]);

                if (shortestDistance > distance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }
        }
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (distance(points[i][0], points[i][1],
                        points[j][0], points[j][1]) == shortestDistance)
                    System.out.println("The closest two points are " +
                            "(" + points[i][0] + ", " + points[i][1] + ") and (" +
                            points[j][0] + ", " + points[j][1] + ")");
            }
        }
        System.out.println("Their distance is " + shortestDistance);
    }
    public static double distance( double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
/*
(All closest pairs of points) Revise Listing 8.3, FindNearestPoints.java, to
 display all closest pairs of points with the same minimum distance.

 Enter the number of points : 8
Enter 8 points: 0 0 1 1 -1 -1 2 2 -2 -2 -3 -3 -4 -4 5 5
The closest two points are (0.0, 0.0) and (1.0, 1.0)
The closest two points are (0.0, 0.0) and (-1.0, -1.0)
The closest two points are (1.0, 1.0) and (0.0, 0.0)
The closest two points are (1.0, 1.0) and (2.0, 2.0)
The closest two points are (-1.0, -1.0) and (0.0, 0.0)
The closest two points are (-1.0, -1.0) and (-2.0, -2.0)
The closest two points are (2.0, 2.0) and (1.0, 1.0)
The closest two points are (-2.0, -2.0) and (-1.0, -1.0)
The closest two points are (-2.0, -2.0) and (-3.0, -3.0)
The closest two points are (-3.0, -3.0) and (-2.0, -2.0)
The closest two points are (-3.0, -3.0) and (-4.0, -4.0)
The closest two points are (-4.0, -4.0) and (-3.0, -3.0)
Their distance is 1.4142135623730951

 */
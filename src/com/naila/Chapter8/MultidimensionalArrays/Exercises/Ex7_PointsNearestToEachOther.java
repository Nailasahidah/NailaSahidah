package com.naila.Chapter8.MultidimensionalArrays.Exercises;

public class Ex7_PointsNearestToEachOther {
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
                {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
                {5.5, 4, -0.5}};

        int p1 = 0, p2 = 1, p3 = 3;
        double shortestDistance = distance(points[p1][0], points[p1][1], points[p1][2],
                points[p2][0], points[p2][p1], points[p3][p2]);

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1], points[i][2],
                        points[j][0], points[j][1], points[j][2]);

                if (shortestDistance > distance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }
        }
        System.out.println("The closest two points are " +
                "(" + points[p1][0] + ", " + points[p1][1] + ") and (" +
                points[p2][0] + ", " + points[p2][1] + ")");
    }
    public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2) + Math.pow(y2 - y1, 2));
    }
}

/*
(Points nearest to each other) Listing 8.3 gives a program that finds two
points in a two-dimensional space nearest to each other. Revise the program so
that it finds two points in a three-dimensional space nearest to each other.
Use a two-dimensional array to represent the points. Test the program using
the following points:
double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
{2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
{5.5, 4, -0.5}};
The formula for computing the distance between two points (x1, y1, z1) and
(x2, y2, z2) is √(x2 - x1)^2 + (y2 - y1)^2 + (z2 - z1)^2.
The closest two points are (3.5, 2.0) and (3.0, 1.5)
 */
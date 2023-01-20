package com.naila.chapter3.Selections.Exercises;

import java.util.Scanner;

public class Soal19ComputeThePerimeterOfaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three edges for a triangle:");
        System.out.print(" Edge 1 points x, y: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print(" Edge 2 points x, y: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print(" Edge 3 points x, y: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        boolean valid = (x1 + y1 > x3 + y3 && x2 + y2 > x3 + y3) ||
                (x1 + y1 > x2 + y2 && x3 + y3 > x2 + y2) ||
                (x3 + y3 > x1 + y1 && x2 + y2 > x1 + y1);

        if (!valid)
        {
            System.out.println("Input is invalid.");
            System.exit(1);
        }

        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

        System.out.println("perimeter of triangle is " + (side1 + side2 + side3));
    }
}

/*
(Compute the perimeter of a triangle) Write a program that reads three edges for
a triangle and computes the perimeter if the input is valid. Otherwise, display that
the input is invalid. The input is valid if the sum of every pair of two edges is
greater than the remaining edge.
*/
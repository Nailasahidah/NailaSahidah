package com.naila.chapter13.AbstractClassesAndInterfaces.Exercises.Exercises_13_01;

import java.util.Scanner;

public class TriangleClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter a color: ");
        String color = input.next();

        System.out.print("Is the triangle filled (true / false)? ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3, color, filled);

        System.out.println(triangle);
    }

}

/*
Enter three sides of the triangle: 3 4 5
Enter a color: black
Is the triangle filled (true / false)? false
created on Wed Mar 15 01:42:24 PDT 2023
color: black and filled: false
Area: 6.0
Perimeter: 12.0
 */
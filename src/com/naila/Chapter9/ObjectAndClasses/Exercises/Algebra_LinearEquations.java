package com.naila.Chapter9.ObjectAndClasses.Exercises;

import java.util.Scanner;

public class Algebra_LinearEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f) ;

        if (linearEquation.isSolvable()) {
            System.out.println("x is " + linearEquation.getX() + " and y is " + linearEquation.getY());
        }
        else
            System.out.println("The equation has no solution.");
    }
}

/*
Enter a, b, c, d, e, f: 2 4 5 6 7 5
x is -2.75 and y is 3.125
 */
package com.naila.Chapter12.ExceptionHandlingAndTextIO.Exercises.IllegalTriangleException;

import java.util.Scanner;

public class Exercises_12_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a color: ");
        String color = input.next();

        System.out.print("Is the triangle filled (true / false)? ");
        boolean filled = input.nextBoolean();

        boolean repeatSidesInput = true;
        do {
            System.out.print("Enter three side of the triangle: ");
            double side1 = input.nextDouble();
            double side2 = input.nextDouble();
            double side3 = input.nextDouble();

            try {
                Triangle triangle = new Triangle(side1 , side2, side3);
                repeatSidesInput = false;

                triangle.setColor(color);
                triangle.setFilled(filled);

                System.out.println(triangle.toString());
                System.out.println("Area: " + triangle.getArea());
                System.out.println("Perimeter: " + triangle.getPerimeter());
                System.out.println("Color: " + triangle.getColor());
                System.out.println("Triangle is" + (triangle.isFilled()? "" : " not ") + "filled");
            }
             catch (IllegalTriangleException ex) {
                 System.out.println(ex.getMessage());
             }
        } while (repeatSidesInput);
    }
}

/*
Enter a color: white
Is the triangle filled (true / false)? true
Enter three side of the triangle: 12
12
12
Triangle: side1 = 12.0 side2 = 12.0 side3 = 12.0
Area: 62.353829072479584
Perimeter: 36.0
Color: white
Triangle isfilled
 */

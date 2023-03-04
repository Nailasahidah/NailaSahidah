package com.naila.Chapter11.InheritanceAndPolymorphism.Latihan;

import javax.swing.*;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(1) ;
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}


/*
A circle created on Fri Mar 03 07:52:16 PST 2023
color: white and filled: false
The color is white
The radius is 1.0
The area is 3.141592653589793
The diameter is 2.0

A rectangle created on Fri Mar 03 07:52:16 PST 2023
color: white and filled: false
The area is 8.0
The perimeter is 12.0
 */
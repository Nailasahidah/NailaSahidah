package com.naila.Chapter11.InheritanceAndPolymorphism.Latihan;

public class PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new Circle(1, "red", false));
        displayObject(new Rectangle(1, 1, "black", true));
    }
    public static void displayObject(GeometricalObject object) {
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
    }
}


/*
Created on Fri Mar 03 07:56:06 PST 2023. Color is red
Created on Fri Mar 03 07:56:06 PST 2023. Color is black
 */
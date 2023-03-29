package com.naila.chapter13.AbstractClassesAndInterfaces.Exercises.Exercises_13_10;

public class Exercises {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1(3, 5, "blue", true);
        Rectangle1 r2 = new Rectangle1(5, 3, "grey", false);
        Rectangle1 r3 = new Rectangle1(3.1, 5, "blue", true);

        System.out.println("Rectangle1 Area : " + r1.getArea());
        System.out.println("Rectangle2 Area : " + r2.getArea());
        System.out.println("Rectangle3 Area : " + r3.getArea());

        System.out.println("Rectangle1 is " + (r1.equals(r2) ? "" : "not ") +
                "equal to Rectangle2");
        System.out.println("Rectangle1 is " + (r1.equals(r3) ? "" : "not ") +
                "equal to Rectangle3");
    }
}


/*
Rectangle1 Area : 15.0
Rectangle2 Area : 15.0
Rectangle3 Area : 15.5
Rectangle1 is equal to Rectangle2
Rectangle1 is not equal to Rectangle3
 */
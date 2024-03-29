package com.naila.chapter13.AbstractClassesAndInterfaces.Exercises.Exercises_13_09;

public class Exercises {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1(5, "red", true);
        Circle1 circle2 = new Circle1(5, "green", false);
        Circle1 circle3 = new Circle1(4, "green", false);

        System.out.println("Circle1 radius: " + circle1.getRadius());
        System.out.println("Circle2 radius: " + circle2.getRadius());
        System.out.println("Circle3 radius: " + circle3.getRadius());

        System.out.println("Circle1 is " + (circle1.equals(circle2) ?
                "" : "not ") + "equal to circle2");
        System.out.println("Circle1 is " + (circle1.equals(circle3) ?
                "" : "not ") + "equal to circle3");
    }
}

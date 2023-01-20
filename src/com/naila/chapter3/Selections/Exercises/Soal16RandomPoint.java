package com.naila.chapter3.Selections.Exercises;

public class Soal16RandomPoint {
    public static void main(String[] args) {
        int width = (int)((Math.random() * (50 + 50)) -50);
        int height = (int)((Math.random() * (100 + 100)) -100);

        System.out.println("Random coordinate in rectangle centered at (0,0)");
        System.out.println(
                "with width 100 and height 200: (" + width + ", " + height + ")");
    }
}

/*
(Random point) Write a program that displays a random coordinate in a rectangle.
The rectangle is centered at (0, 0) with width 100 and height 200.
 */
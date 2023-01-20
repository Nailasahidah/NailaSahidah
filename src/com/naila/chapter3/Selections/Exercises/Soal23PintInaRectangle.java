package com.naila.chapter3.Selections.Exercises;

import java.util.Scanner;

public class Soal23PintInaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        boolean withinRectangle = (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2 ) ||
                (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);

        System.out.println("Point (" + x + ", " + y + ") is " +
                ((withinRectangle) ? "in " : "not in ") + "the rectangle");
    }
}


/*
(Geometry: point in a rectangle?) Write a program that prompts the user to enter
a point (x, y) and checks whether the point is within the rectangle centered at
(0, 0) with width 10 and height 5. For example, (2, 2) is inside the rectangle and
(6, 4) is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is in the
rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its
vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to
cover all cases.) Here are two sample runs:
x-axis (0, 0)
(a) (b)
y-axis
(4, 5)
(9, 9)
(2, 2)
(6, 4)
x-axis
y-axis
(0, 0)
Figure 3.7 (a) Points inside and outside of the circle. (b) Points inside and outside of the
rectangle.

Enter a point with two coordinates: −4.9 2.49
Point (−4.9, 2.49) is in the rectangle
Enter a point with two coordinates: −5.1 −2.4
Point (−5.1, −2.4) is not in the rectangle
 */
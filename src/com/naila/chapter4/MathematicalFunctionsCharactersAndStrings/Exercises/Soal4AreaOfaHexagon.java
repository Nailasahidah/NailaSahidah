package com.naila.chapter4.MathematicalFunctionsCharactersAndStrings.Exercises;
import java.util.Scanner;
public class Soal4AreaOfaHexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the side of a hexagon
        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        // Compute the area of a hexagon
        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

        // Display result
        System.out.printf("The are of the hexagon is %4.2f\n", area);
    }
}

/*(Geometry: area of a hexagon) The area of a hexagon can be computed using the
following formula (s is the length of a side):
Area = 6 * s2 4 * tan(p6 )
Write a program that prompts the user to enter the side of a hexagon and displays
its area. Here is a sample run:
Enter the side: 5.5
The area of the hexagon is 78.59

 */
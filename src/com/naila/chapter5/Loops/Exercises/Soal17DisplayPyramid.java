package com.naila.chapter5.Loops.Exercises;

import java.util.Scanner;

public class Soal17DisplayPyramid {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer from 1 to 15
        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();

        // Display pyramid
        for (int rows = 1; rows <= numberOfLines; rows++) {
            for (int s = numberOfLines - rows; s >= 1; s--) {
                System.out.print("  ");
            }
            for (int l = rows; l >= 2; l--) {
                System.out.print(l + " ");
            }
            for (int r = 1; r <= rows; r++) {
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }
}


/*(Display pyramid) Write a program that prompts the user to enter an integer from
1 to 15 and displays a pyramid, as presented in the following sample run:
Enter the number of lines: 7
 1
 2 1 2
 3 2 1 2 3
 4 3 2 1 2 3 4
 5 4 3 2 1 2 3 4 5
 6 5 4 3 2 1 2 3 4 5 6
7 6 5 4 3 2 1 2 3 4 5 6 7
 */

package com.naila.Chapter6.Methods.Exercises;

import java.util.Scanner;

public class Soal6_DisplayPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter the number of rows: ");
        int numberOfRows = input.nextInt();

        displayPattern(numberOfRows) ;
    }

    public static void displayPattern(int n) {
        int padding = n - 1 ;
        for (int r = 1; r <= n; r++) {
            for (int p = 0; p < padding; p++) {
                System.out.print("  ");
            }
            for (int i = r; i > 0; i++){
                System.out.print( i + " ");
            }
            System.out.println();
            padding--;
        }

    }
}

/*
(Display patterns) Write a method to display a pattern as follows:
 1
 2 1
 3 2 1
...
n n–1 ... 3 2 1
The method header is
public static void displayPattern(int n)
Write a test program that prompts the user
to enter a number n and invokes displayPattern(n)
to display the pattern
 */
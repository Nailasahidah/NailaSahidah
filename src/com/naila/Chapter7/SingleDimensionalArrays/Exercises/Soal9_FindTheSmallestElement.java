package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

import java.util.Scanner;

public class Soal9_FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }
        System.out.println("The minimum number is: " + min(numbers));
    }
    public static double min(double[] array) {
        double min = array[0];
        for (double i: array) {
            if (i < min)
                min = i;
        }
        return min;
    }
}

/*
(Find the smallest element) Write a method that finds the smallest element in an
array of double values using the following header:
public static double min(double[] array)
 Write a test program that prompts the user to enter 10 numbers, invokes this
method to return the minimum value, and displays the minimum value. Here is a
sample run of the program:

Enter ten numbers:  1 2 3 4 5 6 7 8 9 4
The minimum number is: 1.0
 */
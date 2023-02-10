package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

import java.util.Scanner;

public class Soal20_ReviseSelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10] ;

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();

        selectionSort(numbers);

        for (double e: numbers)
            System.out.print(e + " ");
        System.out.println();
    }
    public static void selectionSort(double[] list) {
        for (int i = list.length - 1; i >= 0; i--) {
            double currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}


/*
(Revise selection sort) In Listing 7.8, you used selection sort to sort an array. The
selection-sort method repeatedly finds the smallest number in the current array
and swaps it with the first. Rewrite this program by finding the largest number and
swapping it with the last. Write a test program that reads in 10 double numbers,
invokes the method, and displays the sorted numbers.

Enter ten numbers: 1 2 3 4 5 6 7 8 9 43
1.0 2.0 3.0 4.0 5.0 6.0 7.0 8.0 9.0 43.0
 */
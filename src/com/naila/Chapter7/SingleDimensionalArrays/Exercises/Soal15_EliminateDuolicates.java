package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

import java.util.Scanner;

public class Soal15_EliminateDuolicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int[] numbers = new int[10] ;

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt() ;

        int[] distinctNumbers = eliminateDuplicates(numbers) ;

        System.out.print("The distinct number are: ");
        for (int e: distinctNumbers) {
            if (e > 0)
                System.out.print(" " + e);
        }
        System.out.println();
    }
    public static int[] eliminateDuplicates(int[] list) {
        int[] distinctList = new int[list.length] ;
        int i = 0;
        for (int e: list) {
            if (linearSearch(distinctList, e) == -1) {
                distinctList[i] = e;
                i++;
            }
        }
        return distinctList;
    }
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return i;
        }
        return -1;
    }


}


/*
(Eliminate duplicates) Write a method that returns a new array by eliminating the
duplicate values in the array using the following method header:
public static int[] eliminateDuplicates(int[] list)
 Write a test program that reads in 10 integers, invokes the method, and displays
the distinct numbers separated by exactly one space. Here is a sample run of the
program:

Enter ten numbers: 1 2 3 4 5 6 4 3 2 2
The distinct number are:  1 2 3 4 5 6
 */
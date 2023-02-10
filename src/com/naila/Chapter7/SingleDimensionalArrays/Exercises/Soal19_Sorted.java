package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

import java.util.Scanner;

public class Soal19_Sorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int[] list = new int[input.nextInt()];
        for (int i = 0; i < list.length; i++)
            list[i] = input.nextInt();

        System.out.println(
                "The list is " + (isSorted(list) ? "already " : "not ") + "sorted");
    }
    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1])
                return false;
        }
        return true;
    }
}

/*
9 (Sorted?) Write the following method that returns true if the list is already sorted
in nondecreasing order:
public static boolean isSorted(int[] list)
 Write a test program that prompts the user to enter a list and displays whether the
list is sorted or not. Here is a sample run. Note that the program first prompts the
user to enter the size of the list.

Enter list: 8 10 1 5 16 61 9 11 1
The list is not sorted

 */
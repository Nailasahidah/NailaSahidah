package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

import java.util.Scanner;

public class Soal26_StrictlyIdenticalArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++)
            list1[i] = input.nextInt();
        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++)
            list2[i] = input.nextInt();

        System.out.println("two lists are" + (equals(list1, list2) ? " " : " not ")
                + "strictly identical");
    }
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length)
            return false;

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                return false;
        }
        return false;
    }
}


/*
(Strictly identical arrays) The arrays list1 and list2 are strictly identical
if their corresponding elements are equal. Write a method that returns true if
list1 and list2 are strictly identical, using the following header:
public static boolean equals(int[] list1, int[] list2)
 Write a test program that prompts the user to enter two lists of integers and displays
whether the two are strictly identical. Here are the sample runs. Note the first number in the input for each list indicates the number of the elements in the list. This
number is not part of the list.

Enter list1: 5 2 5 6 6 1
Enter list2: 5 2 5 6 1 6
two lists are not strictly identical
 */
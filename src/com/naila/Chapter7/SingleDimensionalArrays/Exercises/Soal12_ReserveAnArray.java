package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

import java.util.Scanner;

public class Soal12_ReserveAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10] ;


        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();

        reverse(numbers);

        for (int e: numbers) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
    private static void reverse(int[] list) {
        int temp;
        for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
            temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }
}


/*
(Reverse an array) The reverse method in Section 7.7 reverses an array by
copying it to a new array. Rewrite the method that reverses the array passed in
the argument and returns this array. Write a test program that prompts the user to
enter 10 numbers, invokes the method to reverse the numbers, and displays the
numbers.

Enter ten numbers: 1 2 3 4 5 6 7 89 8 3
3 8 89 7 6 5 4 3 2 1
 */
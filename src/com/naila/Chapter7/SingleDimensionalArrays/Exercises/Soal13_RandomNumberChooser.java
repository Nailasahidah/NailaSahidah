package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

import java.util.Scanner;

public class Soal13_RandomNumberChooser {
    static final int SIZE = 10;

    public static void main(String[] args) {
        int[] numbers = new int[SIZE];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers to exclude from random (1-54) : " );
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();

        System.out.println("Number generated: " + getRandom(numbers));
    }
    public static int getRandom(int...numbers) {
        int random = (int)(Math.random() * 54 + 1);
        for (int i = 0; i < numbers.length; i++) {
            if (random == numbers[i]) {
                random = (int)(Math.random() * 54 + 1) ;
                i = -1;
            }
        }
        return random;
    }
}


/*
 (Random number chooser) Write a method that returns a random number between 1 and 54,
  excluding the numbers passed in the argument.
 The method header is specified as follows:

 - public static int getRandom(int... numbers)

Enter ten numbers to exclude from random (1-54) : 1 2 3 4 5 6 7 89 8 43
Number generated: 31
 */

package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

import com.naila.chapter3.Selections.Exercises.Soal24PickACard;

import java.util.Scanner;

public class Soal30_PatternRecognition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int[] values = new int[input.nextInt()] ;

        System.out.print("Enter the values: ");
        for (int i = 0; i < values.length; i++)
            values[i] = input.nextInt();

            System.out.println("The list has" + (isConsecutiveFour(values) ? " " : " no ") + "consecutive fours");
    }
    public static boolean isConsecutiveFour(int[] values){
        int count = 1;

        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i + 1])
                count++;
            if (count >= 4)
                return true;
            if (values[i] != values[i + 1])
                count = 1;
        }
        return false;

    }

}


/*
(Pattern recognition: consecutive four equal numbers) Write the following method
that tests whether the array has four consecutive numbers with the same value:
public static boolean isConsecutiveFour(int[] values)
 Write a test program that prompts the user to enter a series of integers and displays it if the series contains four consecutive numbers with the same value. Your
program should first prompt the user to enter the input size—i.e., the number of
values in the series. Here are sample runs:

Enter the number of values: 8
Enter the values: 3 4 5 5 5 5 4 5
The list has consecutive fours
 */
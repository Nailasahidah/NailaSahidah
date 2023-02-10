package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

import java.util.Scanner;

public class Soal34_SortCharactersInAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = input.nextLine();
        System.out.println(sort(string));
    }
    public static char[] sort(String s) {
        char[] str = new char[s.length()];

        for (int i = 0; i < str.length; i++)
            str[i] = s.charAt(i);

        for (int i = 0; i < str.length - 1; i++){
            char min = str[i];
            int minIndex = i;

            for (int j = i + 1; j < str.length; j++) {
                if (min > str[j]) {
                    min = str[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                str[minIndex] = str[i];
                str[i] = min;
            }
        }
        return str;
    }
}


/*
(Sort characters in a string) Write a method that returns a sorted string using the
following header:
public static String sort(String s)
For example, sort("acb") returns abc.
 Write a test program that prompts the user to enter a string and displays the sorted
string.

Enter a string: 1 4 5 6 7 3 12 3
       112334567
 */
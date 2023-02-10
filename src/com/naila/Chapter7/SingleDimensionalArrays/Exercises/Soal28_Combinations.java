package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

import java.util.Scanner;

public class Soal28_Combinations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10] ;

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();

        printCombinations(numbers);
    }
    public static void printCombinations(int[] numbers) {
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length; j++) {
                if (i != j)
                    System.out.println(numbers[i] + " " + numbers[j]);
            }
        }
    }
}


/*
(Math: combinations) Write a program that prompts the user to enter 10 integers
and displays all combinations of picking two numbers from the 10 numbers.

Enter ten numbers: 1 2 3 4 5 6 7 8 9 4
1 2
1 3
1 4
1 5
1 6
1 7
1 8
1 9
1 4
2 1
2 3
2 4
2 5
2 6
2 7
2 8
2 9
2 4
3 1
3 2
3 4
3 5
3 6
3 7
3 8
3 9
3 4
4 1
4 2
4 3
4 5
4 6
4 7
4 8
4 9
4 4
5 1
5 2
5 3
5 4
5 6
5 7
5 8
5 9
5 4
6 1
6 2
6 3
6 4
6 5
6 7
6 8
6 9
6 4
7 1
7 2
7 3
7 4
7 5
7 6
7 8
7 9
7 4
8 1
8 2
8 3
8 4
8 5
8 6
8 7
8 9
8 4
9 1
9 2
9 3
9 4
9 5
9 6
9 7
9 8
9 4
4 1
4 2
4 3
4 4
4 5
4 6
4 7
4 8
4 9

Process finished with exit code 0

 */
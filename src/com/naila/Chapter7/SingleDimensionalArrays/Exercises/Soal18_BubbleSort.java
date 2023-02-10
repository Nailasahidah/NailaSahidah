package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

import java.util.Scanner;

public class Soal18_BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        double[] numbers = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();
        bubbleSort(numbers);
        for (double e: numbers) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
    public static void bubbleSort(double[] list) {
        double temp;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i +1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped) ;
    }
}


/*
(Bubble sort) Write a sort method that uses the bubble-sort algorithm. The
bubble-sort algorithm makes several passes through the array. On each pass,
successive neighboring pairs are compared. If a pair is not in order, its values are
swapped; otherwise, the values remain unchanged.
The technique is called a bubble sort or sinking sort because the smaller values gradually “bubble” their way to
the top, and the larger values “sink” to the bottom.
Write a test program that reads
in 10 double numbers, invokes the method, and displays the sorted numbers.

Enter ten numbers: 1 2 3 4 5 6 7 8 9 2
1.0 2.0 2.0 3.0 4.0 5.0 6.0 7.0 8.0 9.0

 */
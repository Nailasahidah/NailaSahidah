package com.naila.Chapter8.MultidimensionalArrays.Exercises;

import java.util.Scanner;

public class Ex13_LocateTheLargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter the number of rows and columns of the array: ");
        int row = input.nextInt();
        int column = input.nextInt();

        double[][] array = new double[row][column] ;

        System.out.println("Enter the array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        int[] location = locateLargest(array);

        System.out.println("The location of the largest element is at (" +
                location[0] + ", " + location[1] + ")");
    }
    public static int[] locateLargest(double[][] a) {
        int[] l = new int[2];
        l[0] = 0;
        l[1] = 0;
        double max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    l[0] = i;
                    l[1] = j;
                    max = a[i][j];
                }
            }
        } return l;
    }
}



/*
(Locate the largest element) Write the following method that returns the location
of the largest element in a two-dimensional array:
    public static int[] locateLargest(double[][] a)
The return value is a one-dimensional array that contains two elements. These
two elements indicate the row and column indices of the largest element in the
two-dimensional array. If there are more than one largest element, return the
smallest row index and then the smallest column index.
Write a test program that prompts the user to enter a two-dimensional array and
displays the location of the largest element in the array. Here is a sample run:

Enter the number of rows and columns of the array: 3 4
Enter the array:
23.5 35 2 10
4.5 3 45 3.5
35 44 5.5 9.6
The location of the largest element is at (1, 2)

 */
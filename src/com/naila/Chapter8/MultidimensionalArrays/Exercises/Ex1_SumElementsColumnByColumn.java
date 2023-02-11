package com.naila.Chapter8.MultidimensionalArrays.Exercises;

import java.util.Scanner;

public class Ex1_SumElementsColumnByColumn {
    public static void main(String[] args) {
        double[][] matrix = getMatrix();
        for (int col = 0; col < matrix[0].length; col++) {
            System.out.println(
                    "Sum of the elements at column " + col +
                            " is " + sumColumn(matrix, col));
        }
    }
    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        final int ROWS = 3;
        final int COLUMNS = 4;
        double[][] m = new double[ROWS][COLUMNS];

        System.out.println("Enter a " + ROWS + "-by-" + + COLUMNS + " matrix row by row: ");
        for (int row = 0; row < m.length; row++)
            for (int col = 0; col < m.length; col++)
                m[row][col] = input.nextDouble();
        return m;
    }
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex];
        }
        return sum;
    }
}


/*
(Sum elements column by column) Write a method that returns the sum of all the
elements in a specified column in a matrix using the following header:
public static double sumColumn(double[][] m, int columnIndex)
 Write a test program that reads a 3-by-4 matrix and displays the sum of each
column. Here is a sample run:

Enter a 3-by-4 matrix row by row:
1.5 2 3 4
5.5 6 7 8
9.5 1 3 1
Sum of the elements at column 0 is 12.5
Sum of the elements at column 1 is 15.5
Sum of the elements at column 2 is 18.5
Sum of the elements at column 3 is 0.0
 */
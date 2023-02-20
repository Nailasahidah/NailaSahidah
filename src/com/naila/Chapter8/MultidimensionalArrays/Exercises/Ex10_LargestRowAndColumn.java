package com.naila.Chapter8.MultidimensionalArrays.Exercises;

public class Ex10_LargestRowAndColumn {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2) ;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("THe largest row index: " + largestRow(matrix));
        System.out.println("The largest row column: " + largestColumn(matrix));
    }
    public static int largestRow(int[][] m) {
        int maxRowIndex = 0;
        int max = 0;
        for (int i = 0; i < m.length; i++) {
            int count = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1)
                    count++;
            }
            if (count > max) {
                max = count;
                maxRowIndex = i;
            }
        }
        return maxRowIndex;
    }
    public static int largestColumn(int[][] m) {
        int maxColumnIndex = 0;
        int max = 0;
        for (int col = 0; col < m[0].length; col++) {
            int count = 0;
            for (int row = 0; row < m.length; row++) {
                if (m[row][col] == 1)
                    count++;
            }
            if (count > max) {
                max = count;
                maxColumnIndex = col;
            }
        }
        return maxColumnIndex;
    }
}

/*
(Largest row and column) Write a program that randomly fills in 0s and 1s into
a 4-by-4 matrix, prints the matrix, and finds the first row and column with
the most 1s.

0110
0100
0110
1000
THe largest row index: 0
The largest row column: 1
 */
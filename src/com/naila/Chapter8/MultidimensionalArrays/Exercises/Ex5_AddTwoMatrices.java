package com.naila.Chapter8.MultidimensionalArrays.Exercises;

import java.util.Scanner;

public class Ex5_AddTwoMatrices {
    public static void main(String[] args) {
        double[][] matrix1 = getmatrix(1);
        double[][] matrix2 = getmatrix(2);

        double[][] matrix3 = addMatrix(matrix1, matrix2);

        print(matrix1, matrix2, matrix3);
    }
    public static double[][] getmatrix(int n){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix" + n + ": ");

        double[][] m = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                m[i][j] = input.nextDouble();
        }
        return m;
    }
    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[3][3];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
    public static void print(double[][] m, int r) {
        for (int j = 0; j < m[r].length; j++) {
            System.out.print(m[r][j] + " ");
        }
    }
    public static void print(double[][] m1, double[][] m2, double[][] m3) {
        System.out.println("The matrices are added as follows");

        for (int i = 0; i < 3; i++) {
            print(m1, i) ;
            System.out.print((i == 1 ? "+ " : "  "));
            print (m2, i);
            System.out.print((i == 1 ? "= " : "  "));
            print(m3, i);
            System.out.println();
        }
    }
}


/*
(Algebra: add two matrices) Write a method to add two matrices. The header of
the method is as follows:                                                                                                                                      *
public static double[][] addMatrix(double[][] a, double[][] b)

In order to be added, the two matrices must have the same dimensions and the
same or compatible types of elements. Let c be the resulting matrix. Each
element cij is aij + bij.
Write a test program that prompts the user to enter two 3 * 3 matrices and     *
displays their sum.

Enter matrix1: 1 2 3 4 5 6 7 8 9
Enter matrix2: 9 8 7 6 5 4 3 2 1
The matrices are added as follows
1.0 2.0 3.0   9.0 8.0 7.0   10.0 10.0 10.0
4.0 5.0 6.0 + 6.0 5.0 4.0 = 10.0 10.0 10.0
7.0 8.0 9.0   3.0 2.0 1.0   10.0 10.0 10.0

 */
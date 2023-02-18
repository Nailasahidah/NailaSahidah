package com.naila.Chapter8.MultidimensionalArrays.Exercises;

import java.util.Scanner;

public class Ex6_MultiplyTwoMatrices {
    public static void main(String[] args) {
        double[][] matrix1 = getmatrix(1);
        double[][] matrix2 = getmatrix(2);

        double[][] matrix3 = multiplyMatrix(matrix1, matrix2);

        print(matrix1, matrix2, matrix3);
    }
    public static double[][] getmatrix(int n) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter matrix" + n + ": ");

        double[][] m = new double[3][3];
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j++)
                m[i][j] = input.nextDouble();
        }
        return m;
    }
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] c = new double[3][3];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                for (int h = 0; h < c.length ; h++) {
                    c[i][j] += a[i][h] * b[h][j];
                }
            }
        }
        return c;
    }
    public static void print(double[][] m, int r) {
        for (int j = 0; j < m[r].length; j++) {
            System.out.printf("%5.1f", m[r][j]);
        }
    }
    public static void print(double[][] m1,double[][] m2, double[][] m3 ){
        System.out.println("The matrices are added as follows");

        for (int i = 0; i < 3; i++) {
            print(m1, i);
            System.out.print((i == 1 ? " *" : "  "));
            print(m2, i);
            System.out.print((i == 1 ? " =" : "  "));
            print(m3, i);
            System.out.println();

        }
    }
}

/*
(Algebra: multiply two matrices) Write a method to multiply two matrices. The
header of the method is:

public static double[][] multiplyMatrix(double[][] a, double[][] b)

To multiply matrix a by matrix b, the number of columns in a must be the same
as the number of rows in b, and the two matrices must have elements of the same
or compatible types. Let c be the result of the multiplication. Assume the
column size of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + ...
+ ain * bnj.

Write a test program that prompts the user to enter two 3 * 3 matrices and
displays their product.
Enter matrix1: 1 2 3 4 5 6 7 8 9
Enter matrix2:  0 2 4 1 4.5 2.2 1.1 4.3 5.2
The matrices are added as follows
  1.0  2.0  3.0    0.0  2.0  4.0    5.3 23.9 24.0
  4.0  5.0  6.0 *  1.0  4.5  2.2 = 11.6 56.3 58.2
  7.0  8.0  9.0    1.1  4.3  5.2   17.9 88.7 92.4
 */
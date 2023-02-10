package com.naila.Chapter8.MultidimensionalArrays.Latihan;

import java.util.Scanner;

public class Listing1_Passtwodimensionalarray {
    public static void main(String[] args) {
        int[][] m = getArray();
        System.out.println("\nSum of all elements is " + sum(m));
    }
    public static int[][] getArray() {
        Scanner input = new Scanner(System.in);

        int[][] m = new int[3][4];
        System.out.println("Enter " + m.length + " rows and " + m[0].length + " columns: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j]= input.nextInt();
        return m;
    }
    public static int sum(int[][] m) {
        int total = 0;
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++){
                total += m[row][column];
            }
        }
        return total;
    }
}

/*
Enter 3 rows and 4 columns:
1 2 3 4
5 6 7 8
9 10 11 12

Sum of all elements is 78
 */
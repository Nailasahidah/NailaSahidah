package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

import java.util.Scanner;

public class Soal11_ComputeDeviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10] ;

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i< numbers.length; i++)
            numbers[i] = input.nextDouble() ;

        System.out.println("The mean is " + mean(numbers));
        System.out.println("The standard deviation is " + deviation(numbers));
    }
    public static double deviation(double[] x) {
        double deviation = 0;
        double mean = mean(x);
        for (double e: x) {
            deviation += Math.pow(e - mean, 2) ;
        }
        return Math.sqrt(deviation / (x.length - 1));
    }
    public static double mean(double[] x) {
        double mean = 0;
        for (double e: x) {
            mean += e;
        }
        return mean / x.length;
    }
}


/*
(Statistics: compute deviation)Programming Exercise 5.45 computes the standard
deviation of numbers. This exercise uses a different but equivalent formula to
compute the standard deviation of n numbers.
mean = ani=1 xi n = x1 + x2 +ng + xn deviation = H ani=1 (xi - mean)2 n - 1
 To compute the standard deviation with this formula, you have to store the individual numbers using an array, so they can be used after the mean is obtained.
 Your program should contain the following methods:
/* Compute the deviation of double values */
/*public static double deviation(double[] x)
/* Compute the mean of an array of double values */
/*public static double mean(double[] x)
 Write a test program that prompts the user to enter 10 numbers and displays the
   mean and standard deviation, as presented in the following sample run:

   Enter ten numbers: 1 2 3 4 5 6 7 8 9 1
The mean is 4.6
The standard deviation is 2.875181153713043

 */
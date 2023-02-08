package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

import java.util.Scanner;

public class Soal8_AverageAnArray_RatarataSebuahArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] values = new double[10] ;
        System.out.print("Enter ten values of double type: ");
        for (int i = 0; i < values.length; i++){
            values[i] = input.nextDouble();
        }
        System.out.println("The average value: " + average(values));
    }
    public static int average(int[] array) {
        int average = 0;
        for (int i: array)
            average += i;
        return average / array.length;
    }
    public static double average(double[] array) {
        double average = 0 ;
        for (double i: array)
            average += i;
        return average / array.length;
    }
}

/*
(Average an array) Write two overloaded methods that return the average of an
array with the following headers:
public static double average(int[] array)
public static double average(double[] array)
Write a test program that prompts the user to enter 10 integers, invokes the first
method, then displays the average value; prompts the user to enter 10 double
values, invokes the second method, then displays the average value.

(Rata-rata array) Tulis dua metode kelebihan beban yang mengembalikan rata-rata array dengan header berikut:
public static double average(int[] array)
public static double average(double[] array)
Tulis program pengujian yang meminta pengguna untuk masukkan 10 bilangan bulat,
panggil metode pertama,
lalu tampilkan nilai rata-rata; meminta pengguna untuk memasukkan 10 nilai ganda,
memanggil metode kedua, lalu menampilkan nilai rata-rata.
 */
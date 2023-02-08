package com.naila.Chapter7.SingleDimensionalArrays.Latihan;

public class Listing5_VarArgsDemo {
    public static void main(String[] args) {
        printMax(34, 3, 3, 2, 56.5) ;
        printMax(new double[]{1, 2, 3});
    }
    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0] ;

        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > result)
                result = numbers[i] ;

        System.out.println("The max value is " + result);
    }
}


/*
menyajikan metode yang mencetak nilai maksimum dalam daftar sejumlah nilai
yang tidak ditentukan.

The max value is 56.5
The max value is 3.0
 */
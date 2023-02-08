package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

import java.util.Scanner;

public class Soal3_CountOccurenceOfNumbers_MenghitungKemunculanAngka {
    public static void main(String[] args) {
        int[] counts = new int[100];

        System.out.println("Enter the integers between 1 and 100: ");

        count(counts) ;

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0)
                System.out.println((i + 1) + " occurs " + counts[i] +
                        " time" + (counts[i] > 1 ? "s" : ""));
        }
    }
    public static void count(int[] counts) {
        Scanner input = new Scanner(System.in);
        int num ;
        do{
            num = input.nextInt() ;
            if (num >= 1 && num <=100)
                counts[num - 1]++;
        } while (num != 0);
    }
}
/*
(Count occurrence of numbers) Write a program that reads the integers between
1 and 100 and counts the occurrences of each. Assume the input ends with 0. Here
is a sample run of the program: Note that if a number occurs more than one time, the
plural word “times” is used in the output. Numbers are displayed in increasing order.
(Hitung kemunculan angka) Tulis program yang membaca bilangan bulat di antaranya
1 dan 100 dan menghitung kemunculan masing-masing. Asumsikan input diakhiri dengan 0.
Di sini adalah contoh menjalankan program:
Perhatikan bahwa jika angka muncul lebih dari satu kali, maka
kata jamak "kali" digunakan dalam output.
Angka ditampilkan dalam urutan meningkat.

Enter the integers between 1 and 100:
2 5 6 5 4 3 23 43 2 0
2 occurs 2 times
3 occurs 1 time
4 occurs 1 time
5 occurs 2 times
6 occurs 1 time
23 occurs 1 time
43 occurs 1 time
 */
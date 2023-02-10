package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

import java.util.Scanner;

public class Soal4_AnalyzeScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter scores: (negative number signifies end): ");
        int[] scores = new int[100];
        int num;
        int numberOfScores;
        int average;
        numberOfScores = average = 0;
        for (int i = 0; i < 100; i++) {
            num = input.nextInt();
            if (num < 0)
                break;

            scores[i] = num;
            average += num;
            numberOfScores++;
        }

        average /= numberOfScores;
        int aboveOrEqual;
        int below;
        aboveOrEqual = below = 0;
        for (int i = 0; i < numberOfScores; i++) {
            if (scores[i] >= average)
                aboveOrEqual++;
            else below++;
        }

        System.out.println("\nAverage of scores: " + average);
        System.out.println("Number of scores above or equal to average: " + aboveOrEqual);
        System.out.println("Number of scores below average: " + below);
    }
}
/*
(Analyze scores) Write a program that reads an unspecified number of scores and
determines how many scores are above or equal to the average, and how many
scores are below the average. Enter a negative number to signify the end of the
input. Assume the maximum number of scores is 100.
(Analisis skor) Tulis program yang membaca jumlah skor yang tidak ditentukan dan
menentukan berapa banyak skor di atas atau sama dengan rata-rata, dan berapa banyak
skor berada di bawah rata-rata. Masukkan angka negatif untuk menandakan akhir dari
memasukkan. Asumsikan jumlah skor maksimum adalah 100.

Enter scores: (negative number signifies end): 5
4
4
3
5
-6

Average of scores: 4
Number of scores above or equal to average: 4
Number of scores below average: 1

 */
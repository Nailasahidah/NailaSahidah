package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

import java.util.Scanner;

public class Soal33_ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        String[] zodiacs = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger",
                "rabbit", "dragon", "snake", "horse", "sheep"};

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.println(zodiacs[year % 12]);
    }
}


/*
(Culture: Chinese Zodiac) Simplify Listing 3.9 using an array of strings to store
the animal names.

Enter a year: 2004
monkey
 */
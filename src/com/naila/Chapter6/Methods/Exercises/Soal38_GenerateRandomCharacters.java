package com.naila.Chapter6.Methods.Exercises;

import com.naila.Chapter6.Methods.Latihan.Listing10RandomCharacter;

public class Soal38_GenerateRandomCharacters {
    public static void main(String[] args) {
        final int NUMBER_OF_UPPERCASE_LETTERS = 100;
        final int NUMBER_OF_SINGLE_DIGITS = 100;
        final int NUMBERS_PER_LINE = 10;

        for (int i = 1; i <= NUMBER_OF_UPPERCASE_LETTERS; i++) {
            System.out.print(Listing10RandomCharacter.getRandomUpperCaseLetter());
            System.out.print(i % NUMBERS_PER_LINE == 0 ? "\n" : " ");
        }

        for (int i = 1; i <= NUMBER_OF_SINGLE_DIGITS; i++) {
            System.out.print(Listing10RandomCharacter.getRandomDigitCharacter());
            System.out.print(i % NUMBERS_PER_LINE == 0 ? "\n" : " ");
        }
    }
}


/*
(Generate random characters) Use the methods in RandomCharacter in Listing
6.10 to print 100 uppercase letters and then 100 single digits, printing ten per line.
*/
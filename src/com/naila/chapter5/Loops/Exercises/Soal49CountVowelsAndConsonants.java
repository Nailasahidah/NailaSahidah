package com.naila.chapter5.Loops.Exercises;

import java.util.Scanner;

public class Soal49CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        int vowels,
                consonants;
        vowels = consonants = 0;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                if (Character.toUpperCase(string.charAt(i)) == 'A' ||
                        Character.toUpperCase(string.charAt(i)) == 'E' ||
                        Character.toUpperCase(string.charAt(i)) == 'I' ||
                        Character.toUpperCase(string.charAt(i)) == 'O' ||
                        Character.toUpperCase(string.charAt(i)) == 'U') {
                    vowels++;
                } else
                    consonants++;
            }

            System.out.println("The number of vowels is " + vowels);
            System.out.println("The number of consonants is " + consonants);
        }
    }
}

/*(Count vowels and consonants) Assume that the letters A, E, I, O, and U are vowels. Write a program that prompts the user to enter a string, and displays the
number of vowels and consonants in the string.
Enter a string: Programming is fun
The number of vowels is 5
The number of consonants is 11

 */
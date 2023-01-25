package com.naila.Chapter6.Methods.Exercises;

import java.util.Scanner;

public class Soal21_PhoneKeypads {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter a string: ");
        String string = input.nextLine() ;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i)))
                System.out.print(getNumber(Character.toUpperCase(string.charAt(i))));
            else
                System.out.print(string.charAt(i));
        }
        System.out.println();
    }
    public static int getNumber(char uppercaseLetter) {
        if (uppercaseLetter >= 'W')
            return 9;
        else if (uppercaseLetter >= 'T')
            return 8;
        else if (uppercaseLetter >= 'P')
            return 7;
        else if (uppercaseLetter >= 'M')
            return 6;
        else if (uppercaseLetter >= 'J')
            return 5;
        else if (uppercaseLetter >= 'G')
            return 4;
        else if (uppercaseLetter >= 'D')
            return 3;
        else
            return 2;
    }
}


/*
(Phone keypads) The international standard letter/number mapping for telephones is given in Programming Exercise 4.15. Write a method that returns a
number, given an uppercase letter, as follows:
public static int getNumber(char uppercaseLetter)
Write a test program that prompts the user to enter a phone number as a string.
The input number may contain letters. The program translates a letter (uppercase
or lowercase) to a digit and leaves all other characters intact. Here are sample
runs of the program:
Enter a string: 1-800-Flowers
1-800-3569377
Enter a string: 1800flowers
18003569377
 */
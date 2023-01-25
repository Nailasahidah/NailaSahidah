package com.naila.Chapter6.Methods.Exercises;

import java.util.Scanner;

public class Soal23_OccurrencesOfASpecifiedCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print(
                "Enter a string followed by a character e.g. Welcome, e : " );
        String string = input.nextLine();
        int k = string.indexOf(", ");
        String str = string.substring(0, k);
        char ch = string.charAt(k + 2);
        System.out.println(
                "The number of occurrences of \"" + ch + "\" in \'" + str + "\" is: " +
                       count(str, ch));
    }
    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (a == str.charAt(i))
                count++;
        }
        return count;
    }
}


/*
(Occurrences of a specified character) Write a method that finds the number of
occurrences of a specified character in a string using the following header:
public static int count(String str, char a)
For example, count("Welcome", 'e') returns 2. Write a test program that
prompts the user to enter a string followed by a character then displays the
number of occurrences of the character in the string.
 */
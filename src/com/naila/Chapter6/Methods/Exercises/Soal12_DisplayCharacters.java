package com.naila.Chapter6.Methods.Exercises;

public class Soal12_DisplayCharacters {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS_PER_LINE = 10 ;
        char ch1 = '1' ;
        char ch2 = 'z';

        System.out.println("\nCharacters per 1 to z");
        printChars(ch1, ch2, NUMBER_OF_CHARS_PER_LINE);
        System.out.println();
    }
    public static void printChars(char ch1, char ch2, int numberPerLine) {
        for (char c = ch1, count = 1; c <= ch2; c++, count++) {
            if (count % numberPerLine == 0)
                System.out.println(c);
            else System.out.print(c + " ");
        }
    }
}

/*(Display characters) Write a method that prints characters using the following
header:
public static void printChars(char ch1, char ch2, int
 numberPerLine)
This method prints the characters between ch1 and ch2 with the specified numbers per line. Write a test program that prints 10 characters per line from 1 to Z.
Characters are separated by exactly one space.

 */
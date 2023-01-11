package com.naila.chapter4.MathematicalFunctionsCharactersAndStrings.Exercises;

import java.util.Scanner;

public class Soal20ProcessAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter a string: ");
        String str = input.nextLine() ;
        System.out.println(str + " has a length of " + str.length() + " and its first character is " + str.charAt(0));
    }
}


/* (Process a string) Write a program that prompts the user to enter a string and
displays its length and its first character.

 */
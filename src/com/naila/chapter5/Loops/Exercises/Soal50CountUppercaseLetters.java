package com.naila.chapter5.Loops.Exercises;

import java.util.Scanner;

public class Soal50CountUppercaseLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i)))
                count++;
        }
        System.out.println("The number of uppercase letters is " + count);
    }
}

/*(Count uppercase letters) Write a program that prompts the user to enter a string
and displays the number of the uppercase letters in the string.
Enter a string: Welcome to Java
The number of uppercase letters is 2

 */
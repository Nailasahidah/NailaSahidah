package com.naila.chapter3.Selections.Exercises;

import java.util.Scanner;

public class Soal12PalindromeInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        int digit1 = (int)(number / 100);
        int remaining = number % 100;
        int digit3 = (int)(remaining % 10);

        System.out.println(
                number + ((digit1 == digit3) ? " is a " : " is not a ") + "palindrome");
    }
}

/*
(Palindrome integer) Write a program that prompts the user to enter a three-digit
integer and determines whether it is a palindrome integer. An integer is palindrome
if it reads the same from right to left and from left to right. A negative integer is
treated the same as a positive integer. Here are sample runs of this program:
Enter a three-digit integer: 121
121 is a palindrome
Enter a three-digit integer: 123
123 is not a palindrome
 */
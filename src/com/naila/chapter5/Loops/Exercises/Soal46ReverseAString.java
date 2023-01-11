package com.naila.chapter5.Loops.Exercises;

import java.util.Scanner;

public class Soal46ReverseAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse += string.charAt(i);
        }
        System.out.println("The reversed string is " + reverse);
    }
}

/*(Reverse a string) Write a program that prompts the user to enter a string and
displays the string in reverse order.
Enter a string: ABCD
The reversed string is DCBA

 */

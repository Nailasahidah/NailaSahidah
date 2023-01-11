package com.naila.chapter5.Loops.Exercises;

import java.util.Scanner;

public class Soal48ProcessString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        String oddPositions = "";
        for (int i = 0; i < string.length(); i+=2) {
            oddPositions += string.charAt(i);
        }
        System.out.println(oddPositions);
    }
}

/*(Process string) Write a program that prompts the user to enter a string and displays the characters at odd positions. Here is a sample run:
Enter a string: Beijing Chicago
BiigCiao

 */
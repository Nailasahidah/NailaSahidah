package com.naila.Chapter6.Methods.Exercises;

import java.util.Scanner;

public class Soal4_DisplayAnIntegerReserved {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Display and integer reserved: ");

        System.out.print("Enter an integer: ");
        int number = input.nextInt() ;

        reserve(number) ;
    }
    public static void reserve(int number) {
        while (number > 0) {
            System.out.print((number % 10));
            number /= 10 ;
        }
        System.out.println();
    }
}

/*
(Display an integer reversed) Write a method with the following header to display an integer in reverse order:
public static void reverse(int number)
For example, reverse(3456) displays 6543. Write a test program that prompts
the user to enter an integer then displays its reversal.
 */
package com.naila.chapter5.Loops.Exercises;

import java.util.Scanner;

public class Soal44ComputerArchitectureBitLevelOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        short number = input.nextShort();

        String bits = "";

        for (int i = 0; i < 16; i++) {
            bits = (number & 1) + bits;
            number >>= 1;
        }

        System.out.println("The bits are " + bits);
    }
}


/*(Computer architecture: bit-level operations) A short value is stored in 16 bits.
Write a program that prompts the user to enter a short integer and displays the 16
bits for the integer. Here are sample runs:
Enter an integer: 5
The bits are 0000000000000101
Enter an integer: –5
The bits are 1111111111111011

 */
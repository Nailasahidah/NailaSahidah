package com.naila.chapter5.Loops.Exercises;

import java.util.Scanner;

public class Soal37DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();

        String binary = "";
        for (int i = decimal; i > 0; i /= 2) {
            binary = (i % 2) + binary;
        }
        System.out.println(
                "The binary value of the decimal \" " + decimal + " \"is: " + binary);
    }
}


/* (Decimal to binary) Write a program that prompts the user to enter a decimal
integer then displays its corresponding binary value. Don’t use Java’s Integer.
toBinaryString(int) in this program

 */
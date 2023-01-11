package com.naila.chapter5.Loops.Exercises;

import java.util.Scanner;

public class Soal38DecimalToOctal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();
        String octal = "";
        for (int i = decimal; i > 0; i /= 8) {
            octal = i % 8 + octal;
        }

        System.out.println("The octal of " + decimal + " is " + octal);
    }
}
/*(Decimal to octal) Write a program that prompts the user to enter a decimal
integer and displays its corresponding octal value. Don’t use Java’s Integer.
toOctalString(int) in this program.

 */
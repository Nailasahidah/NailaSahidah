package com.naila.chapter4.MathematicalFunctionsCharactersAndStrings.Exercises;

import java.util.Scanner;

public class Soal11DecimalToHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter a decimal value (0 to 15) : ") ;
        int decimal = input.nextInt(0 );

        if (decimal >= 0 && decimal <=9)
            System.out.println("The hex value is " + decimal);
        else if (decimal >= 10 && decimal <= 15)
            System.out.println("Te hex value is " + (char)(decimal + 'A' - 10));
        else System.out.println(decimal + " is an invalid input" ) ;
    }
}

/*(Decimal to hex) Write a program that prompts the user to enter an integer between 0 and 15 and displays its corresponding hex number. For an incorrect
input number, display invalid input. Here are some sample runs:
Enter a decimal value (0 to 15): 11
The hex value is B
Enter a decimal value (0 to 15): 5
The hex value is 5
Enter a decimal value (0 to 15): 31
31 is an invalid input
 */

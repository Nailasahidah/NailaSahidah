package com.naila.chapter4.MathematicalFunctionsCharactersAndStrings.Exercises;

import java.util.Scanner;

public class Soal8FindTheCharacterOfAnASCIIcode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter an ASCII code: " ) ;
        int i = input.nextInt() ;
        System.out.println((char)i) ;

    }
}

/*(Find the character of an ASCII code) Write a program that receives an ASCII code
(an integer between 0 and 127) and displays its character. Here is a sample run:
Enter an ASCII code: 69
The character for ASCII code 69 is E

 */
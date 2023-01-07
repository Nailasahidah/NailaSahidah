package com.naila.chapter4.MathematicalFunctionsCharactersAndStrings.Exercises;

import java.util.Scanner;

public class Soal9FindTheUnicodeOfaCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ") ;
        String s = input.nextLine() ;
        char ch = s.charAt(0) ;

        System.out.println((int)ch) ;
    }
}

/*(Find the Unicode of a character) Write a program that receives a character and
displays its Unicode. Here is a sample run:
Enter a character: E
The Unicode for the character E is 69

 */
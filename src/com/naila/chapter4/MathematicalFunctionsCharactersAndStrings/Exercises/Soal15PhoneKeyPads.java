package com.naila.chapter4.MathematicalFunctionsCharactersAndStrings.Exercises;

import java.util.Scanner;

public class Soal15PhoneKeyPads {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter a letter: ") ;
        String s = input.nextLine() ;
        char ch = s.charAt(0) ;
        ch = Character.toUpperCase(ch) ;

        int number = 0 ;
        if ( Character.isLetter(ch)){
            if (ch >= 'W')
                number = 9 ;
            else  if (ch >= 'T')
                number = 8;
            else if (ch >= 'P')
                number = 7;
            else if (ch >= 'M')
                number = 6;
            else if (ch >= 'J')
                number = 5;
            else if (ch >= 'G')
                number = 4;
            else if (ch >= 'D')
                number = 3;
            else if (ch >= 'A')
                number = 2;
            System.out.println("The corresponding number is " + number);
        }
        else
            System.out.println(ch + " is an invalid input");
    }
}


/* (Phone key pads) The international standard letter/number mapping found on the
telephone is shown below:
Write a program that prompts the user to enter a lowercase or uppercase letter and displays its corresponding number. For a nonletter input, display invalid
input.
Enter a letter: A
The corresponding number is 2
Enter a letter: a
The corresponding number is 2
Enter a letter: +
+ is an invalid input
 */
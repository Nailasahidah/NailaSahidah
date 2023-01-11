package com.naila.chapter4.MathematicalFunctionsCharactersAndStrings.Exercises;

import java.util.Scanner;

public class Soal22CheckSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter string s1 : " ) ;
        String string1 = input.nextLine() ;
        System.out.print("Enter string s2 : ") ;
        String string2 = input.nextLine() ;
        System.out.println(string2 + ((string1.contains(string2)) ? " is " : " is not ") +
                 "a substring of " + string1) ;
    }
}


/*
(Check substring) Write a program that prompts the user to enter two strings, and
reports whether the second string is a substring of the first string.
Enter string s1: ABCD
Enter string s2: BC
BC is a substring of ABCD

Enter string s1: ABCD
Enter string s2: BDC
BDC is not a substring of ABCD
 */
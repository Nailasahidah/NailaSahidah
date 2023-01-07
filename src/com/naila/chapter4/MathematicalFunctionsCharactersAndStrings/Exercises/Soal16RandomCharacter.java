package com.naila.chapter4.MathematicalFunctionsCharactersAndStrings.Exercises;

public class Soal16RandomCharacter {
    public static void main(String[] args) {
        int number = 65 + (int)(Math.random() * (91 - 65)) ;
        System.out.println((char)(number));

    }
}

/* (Random character) Write a program that displays a random uppercase letter
using the Math.random() method.

 */
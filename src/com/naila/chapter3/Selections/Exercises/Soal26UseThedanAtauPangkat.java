package com.naila.chapter3.Selections.Exercises;

import java.util.Scanner;

public class Soal26UseThedanAtauPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println("Is 10 divisible by 5 and 6? " +
                ((number % 5 == 0) && (number % 6 == 0)));
        System.out.println("Is 10 divisible by 5 or 6? " +
                ((number % 5 == 0) || (number % 6 == 0)));
        System.out.println("Is 10 divisible by 5 of 6, but not both? " +
                ((number % 5 == 0) ^ (number % 6 == 0)));
    }
}


/*
(Use the &&, ||, and ^ operators) Write a program that prompts the user to
enter an integer and determines whether it is divisible by 5 and 6, whether it is
divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a
sample run of this program:

Enter an integer: 10
Is 10 divisible by 5 and 6? false
Is 10 divisible by 5 or 6? true
Is 10 divisible by 5 or 6, but not both? true
 */
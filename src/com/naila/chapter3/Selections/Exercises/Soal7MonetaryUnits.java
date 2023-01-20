package com.naila.chapter3.Selections.Exercises;

import java.util.Scanner;

public class Soal7MonetaryUnits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print(
                "Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();
        int remainingAmount = (int)(amount * 100);

        int numberOfDollars = remainingAmount / 100;
        remainingAmount %= 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfDollars +
                (numberOfDollars == 1 ? " dollar" : " dollars"));
        System.out.println(" " + numberOfQuarters +
                (numberOfQuarters == 1 ? " quarter" : " quarters"));
        System.out.println(" " + numberOfDimes +
                (numberOfDimes == 1 ? " dime" : " dimes"));
        System.out.println(" " + numberOfNickels +
                (numberOfNickels == 1 ? " nickel" : " nickels"));
        System.out.println(" " + numberOfPennies +
                (numberOfPennies == 1 ? " pennie" : " pennies"));
    }
}

/*
(Financial application: monetary units) Modify Listing 2.10, ComputeChange.
java, to display the nonzero denominations only, using singular words for single
units such as 1 dollar and 1 penny, and plural words for more than one unit such
as 2 dollars and 3 pennies.
 */
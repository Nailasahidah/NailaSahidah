package com.naila.chapter3.Selections.Exercises;

import java.util.Scanner;

public class Soal33CompareCosts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        if (price1 / weight1 < price2 / weight2)
            System.out.println("Package 1 has a better price.");
        else if (price1 / weight1 > price2 / weight2)
            System.out.println("Package 2 has a better price.");
        else
            System.out.println("Two packages have the same price.");
    }
}

/*
(Financial: compare costs) Suppose you shop for rice in two different packages.
You would like to write a program to compare the cost. The program prompts the
user to enter the weight and price of each package and displays the one with the
better price. Here is a sample run:

Enter weight and price for package 1: 50 24.59
Enter weight and price for package 2: 25 11.99
Package 2 has a better price.

Enter weight and price for package 1: 50 25
Enter weight and price for package 2: 25 12.5
Two packages have the same price.
 */
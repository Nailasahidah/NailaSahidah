package com.naila.chapter5.Loops.Exercises;

import java.util.Scanner;

public class Soal1CountPositiveAndNegativeNumbersAndComputeTheAverageOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positives = 0; // Count the number of positive numbers
        int negatives = 0; // Count the number of negative numbers
        int count = 0; // Count all numbers
        double total = 0; // Accumulate a total

        // Prompt the user to enter an integer or 0 to exit
        System.out.print("Enter an integer, the input ends if it is 0: ") ;
        int number = input.nextInt() ;

        if (number == 0) { //Test for sentinel value
            System.out.println("No numbers are entered except 0");
            System.exit(10);
        }

        while (number != 0) {
            if (number > 0)
                positives++;
            else
                negatives++;
            total += number;
            count++;
            number = input.nextInt();
        }

        //Calculate the average
        double average = total / count ;
        System.out.println("The number of positives is " + positives +
                "\nThe number of negativee is " + negatives +
                "\nThe total is total " + total +
                "\nThe average is " + average) ;
    }
}


/*(Count positive and negative numbers and compute the average of numbers)
 Write a program that reads an unspecified number of integers,
 determines how many positive and negative values have been read,
 and computes the total and average of the input values (not counting zeros).
 Your program ends with the input 0
*/

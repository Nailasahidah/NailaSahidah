package com.naila.Chapter6.Methods.Exercises;

import java.util.Scanner;

public class Soal2_SumThedigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter a integer: ");
        long number = input.nextLong() ;

        System.out.println("The sum of the digits in " + number + " is " + sumDigits(number));
    }

    /** Compute the sum of the digits in an integer */
    public static long sumDigits(long n) {
        int sum = 0 ;
        while (n > 0) {
            sum += n % 10 ;
            n /= 10;
        }

        return sum;
    }
}

/*
(Sum the digits in an integer) Write a method that computes the sum of the digits
in an integer. Use the following method header:
public static int sumDigits(long n)
For example, sumDigits(234) returns 9 (= 2 + 3 + 4). (Hint: Use the % operator to extract digits and the / operator to remove the extracted digit. For instance, to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use
234 / 10 (= 23). Use a loop to repeatedly extract and remove the digit until
all the digits are extracted. Write a test program that prompts the user to enter an
integer then displays the sum of all its digits.
 */

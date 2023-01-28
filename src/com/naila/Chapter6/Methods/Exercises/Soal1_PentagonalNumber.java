package com.naila.Chapter6.Methods.Exercises;

public class Soal1_PentagonalNumber {
    public static void main(String[] args) {
        final int NUMBER_OF_PENTAGONALS = 100;
        final int NUMBER_PER_LINE = 10;
        System.out.println("The first 100 pentagonal numbers, ten per line: ");
        for (int i = 1; i <= NUMBER_OF_PENTAGONALS; i++) {

            if (i % NUMBER_PER_LINE == 0)
                System.out.printf("%7d\n", getPentagonalNumber(i));
            else
                System.out.printf("%7d", getPentagonalNumber(i));
        }
    }
        public static int getPentagonalNumber(int n){
            return (n * (3 * n - 1)) / 2 ;
        }

}


/*
(Math: pentagonal numbers) A pentagonal number is defined as n(3n-1)/2 for
n = 1, 2, ..., and so on. Therefore, the first few numbers are 1, 5, 12, 22, ... .
Write a method with the following header that returns a pentagonal number:
public static int getPentagonalNumber(int n)
For example, getPentagonalNumber(1) returns 1 and getPentagonalNumber(2) returns 5. Write a test program that uses this method to display the first
100 pentagonal numbers with 10 numbers on each line. Use the %7d format to
display each number.
 */

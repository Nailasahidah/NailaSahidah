package com.naila.chapter5.Loops.Exercises;

public class Soal20DisplayPrimeNumbersBetween2And1000 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES_PER_LINE = 8;
        int count = 0;

        System.out.println(
                "The prime numbers between 2 and 1,000, inclusive are \n");

        for (int number = 2; number <= 1000; number++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0)	{
                    isPrime = false;
                    break;
                }
            }


            if (isPrime) {
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {

                    System.out.println(number);
                }
                else
                    System.out.print(number + " ");
            }
        }
    }

}
/*(Display prime numbers between 2 and 1,000) Modify the program given in Listing
5.15 to display all the prime numbers between 2 and 1,000, inclusive. Display eight
prime numbers per line. Numbers are separated by exactly one space.

 */
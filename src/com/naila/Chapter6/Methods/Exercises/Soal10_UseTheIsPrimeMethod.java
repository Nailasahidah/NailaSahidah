package com.naila.Chapter6.Methods.Exercises;

import com.naila.Chapter6.Methods.Latihan.Listing7PrimeNumberMethod;

public class Soal10_UseTheIsPrimeMethod {
    public static void main(String[] args) {
        int numberOfPrimes = 0 ;
        for (int i = 1; i < 1000; i++) {
            if (Listing7PrimeNumberMethod.isPrime(i))
                numberOfPrimes++;
        }

        System.out.println("The number of prime numbers less than 1000: " + numberOfPrimes);
    }
}

/*
(Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
isPrime(int number) method for testing whether a number is prime. Use
this method to find the number of prime numbers less than 10000.
 */
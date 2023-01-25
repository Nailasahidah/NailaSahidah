package com.naila.Chapter6.Methods.Exercises;

import com.naila.Chapter6.Methods.Latihan.Listing7PrimeNumberMethod;

public class Soal29_TwinPrimes {
    public static void main(String[] args) {
        System.out.println();
        for (int p = 2; p < 1000; p++) {
            if (isTwinPrime(p))
                System.out.println("(" + p + ", " + (p + 2) + ")");
        }
    }
    public  static boolean isTwinPrime(int num) {
        return Listing7PrimeNumberMethod.isPrime(num) && Listing7PrimeNumberMethod.isPrime(num + 2) ;
    }
}

/*
(Twin primes) Twin primes are a pair of prime numbers that differ by 2. For
example, 3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are
twin primes. Write a program to find all twin primes less than 1,000. Display the
output as follows:
(3, 5)
(5, 7)
...
 */
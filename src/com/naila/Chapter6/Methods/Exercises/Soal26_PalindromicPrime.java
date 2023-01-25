package com.naila.Chapter6.Methods.Exercises;

import com.naila.Chapter6.Methods.Latihan.Listing7PrimeNumberMethod;

public class Soal26_PalindromicPrime {
    public static void main(String[] args) {
        final int NUMBER_OF_PALINDROMIC_PRIMES = 100;
        final int NUMBERS_PER_LINE = 10;
        int count = 0;
        int n = 2;

        while (count < NUMBER_OF_PALINDROMIC_PRIMES) {
            if (isPalindromicPrime(n)) {
                count++;
                System.out.print(count % NUMBERS_PER_LINE == 0 ? n + "\n" : n + " ");
            }
            n++;
        }
    }
    public static boolean isPalindromicPrime(int num) {
        return Listing7PrimeNumberMethod.isPrime(num) &&
              Soal3_PalindromeInteger.isPalindrome(num);
    }
}

/*
(Palindromic prime) A palindromic prime is a prime number and also palindromic. For example, 131 is a prime and also a palindromic prime, as are 313
and 757. Write a program that displays the first 100 palindromic prime numbers.
Display 10 numbers per line, separated by exactly one space, as follows:
2 3 5 7 11 101 131 151 181 191
313 353 373 383 727 757 787 797 919 929
...
 */
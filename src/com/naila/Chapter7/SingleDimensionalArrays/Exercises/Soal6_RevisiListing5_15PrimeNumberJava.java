package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

public class Soal6_RevisiListing5_15PrimeNumberJava {
    static final int NUMBER_OF_PRIMES = 50;
    public static void main(String[] args) {
        int [] primeNumbers = new int[NUMBER_OF_PRIMES] ;
        int index = 0;

        for (int i = 2; index < NUMBER_OF_PRIMES; i++) {
            if (isPrime(i)) {
                primeNumbers[index++] = i;
            }
        }
        printArray(primeNumbers, 10) ;
    }
    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0)
                return false;
        }
        return true;
    }
    public static void printArray(int[] array, int numberPerLine) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%10d ", array[i]);
            if ((i + 1) % numberPerLine == 0)
                System.out.println("");
        }
    }
}

/*
(Revise Listing 5.15, PrimeNumber.java) Listing 5.15 determines whether a number n is prime by checking whether 2, 3, 4, 5, 6, . . . , n/2 is a divisor. If a divisor
is found, n is not prime. A more efficient approach is to check whether any of the
prime numbers less than or equal to 2n can divide n evenly. If not, n is prime.
Rewrite Listing 5.15 to display the first 50 prime numbers using this approach.
You need to use an array to store the prime numbers, and later use them to check
whether they are possible divisors for n
(Revisi Listing 5.15, PrimeNumber.java) Listing 5.15 menentukan apakah suatu bilangan n adalah
bilangan prima dengan memeriksa apakah 2, 3, 4, 5, 6, . . . , n/2 adalah pembagi. Jika pembagi
ditemukan, n bukan bilangan prima. Pendekatan yang lebih efisien adalah memeriksa apakah salah satu dari
bilangan prima kurang dari atau sama dengan 2n dapat membagi n secara merata. Jika tidak, n adalah prima.
Tulis ulang Listing 5.15 untuk menampilkan 50 bilangan prima pertama menggunakan pendekatan ini.
Anda perlu menggunakan larik untuk menyimpan bilangan prima, dan kemudian menggunakannya untuk memeriksa
apakah mereka pembagi yang mungkin untuk n.

         2          3          5          7         11         13         17         19         23         29
        31         37         41         43         47         53         59         61         67         71
        73         79         83         89         97        101        103        107        109        113
       127        131        137        139        149        151        157        163        167        173
       179        181        191        193        197        199        211        223        227        229
 */
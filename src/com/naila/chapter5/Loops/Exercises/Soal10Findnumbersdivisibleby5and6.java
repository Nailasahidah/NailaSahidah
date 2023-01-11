package com.naila.chapter5.Loops.Exercises;

public class Soal10Findnumbersdivisibleby5and6 {
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10 ;
        int count = 0 ;
        for (int i = 100; i <= 1000; i++){
            if (i % 5 == 0 && i % 6 == 0) {
                count++ ;
                if (count % NUMBERS_PER_LINE == 0)
                    System.out.println(i) ;
                else
                    System.out.print(i + " ") ;

            }
        }
    }
}

/* (Find numbers divisible by 5 and 6) Write a program that displays all the numbers from 100 to 1,000 (10 per line) that are divisible by 5 and 6. Numbers are
separated by exactly one space.

 */
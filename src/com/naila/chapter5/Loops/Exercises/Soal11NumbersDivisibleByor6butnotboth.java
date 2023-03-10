package com.naila.chapter5.Loops.Exercises;

public class Soal11NumbersDivisibleByor6butnotboth {
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10 ;
        int count = 0 ;
        for (int i = 100; i <= 200; i++){
            if (i % 5 == 0 ^ i % 6 == 0) {
                count++;
                if (count % NUMBERS_PER_LINE == 0)
                    System.out.println(i);
                else System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

/*(Find numbers divisible by 5 or 6, but not both) Write a program that displays
all the numbers from 100 to 200 (10 per line) that are divisible by 5 or 6, but not
both. Numbers are separated by exactly one space.

 */
package com.naila.chapter5.Loops.Exercises;

import java.util.Scanner;

public class Soal35Summation {
    public static void main(String[] args) {
     double summation = 0.0 ;
     for (double i = 1.0; i <= 624.0; i++) {
         summation += 1 / (Math.sqrt(i) + Math.sqrt(i + 1)) ;
     }
        System.out.println("Summation: " + summation);
    }
}

/* (Summation) Write a program to compute the following summation:
1 / (1 + √2) + 1 / (√2 + √3) + 1 / (√3 + √4) + ... +  1 / (√624 + √625)

 */
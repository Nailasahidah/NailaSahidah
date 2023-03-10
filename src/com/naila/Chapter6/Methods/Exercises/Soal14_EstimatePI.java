package com.naila.Chapter6.Methods.Exercises;

public class Soal14_EstimatePI {
    public static void main(String[] args) {
        double start = 1;
        double end = 901 ;
        System.out.println("\ni           m(i)   ");
        System.out.println("--------------");
        for (double i = start; i <= end; i += 100) {
            System.out.printf("%-12.0f", i);
            System.out.printf("%-6.4f\n", estimatePI(i));
        }
    }
    public static double estimatePI(double n) {
        double pi = 0;
        for (double i = 1; i <= n; i++) {
            pi += Math.pow(-1, i +1) / (2 * i - 1) ;
        }
        pi *= 4;
        return pi;
    }
}


/*
(Estimate p) p can be computed using the following series:
m(i) = 4(1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + ... + (((-1)^i + 1) / (2i - 1)))
Write a method that returns m(i) for a given i and write a test program that displays
the following table:
*/
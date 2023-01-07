package com.naila.chapter5.tugas;

public class Soal6 {
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.609 ;
        System.out.println("Miles     Kilometers       |     Kilometers       Miles") ;
        for (int m = 1, k = 20; m <= 10 && k <= 65; m++, k += 5) {
            System.out.printf("%-11d%-10.3f", m, (m * KILOMETERS_PER_MILE)) ;
            System.out.print("      |       ") ;
            System.out.printf("%-15d%-6.3f\n", k, (k / KILOMETERS_PER_MILE)) ;
        }
    }
}


/* (Conversion from miles to kilometers) Write a program that displays the following two tables side by side:
Miles    Kilometers | Kilometers    Miles
1          1.609    |     20        12.430
2          3.218    |     25        15.538
. . .
9          14.481   |     60        37.290
10         16.090   |     65        40.398

 */
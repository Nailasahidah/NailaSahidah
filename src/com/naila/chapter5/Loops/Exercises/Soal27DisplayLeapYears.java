package com.naila.chapter5.Loops.Exercises;

public class Soal27DisplayLeapYears {
    public static void main(String[] args) {
        System.out.println("All the leap years from 101 to 2100:");
        int count = 0;
        for (int year = 101; year <= 2100; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                count++;

                System.out.print(year + (count % 10 == 0 ? "\n" : " "));
            }
        }
        System.out.println();
    }

}
/*(Display leap years) Write a program that displays all the leap years, 10 per line,
from 101 to 2100, separated by exactly one space. Also display the number of
leap years in this period.

 */
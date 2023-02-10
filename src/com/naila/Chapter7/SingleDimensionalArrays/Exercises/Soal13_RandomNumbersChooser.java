package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

public class Soal13_RandomNumbersChooser {
    public static int getRandom(int... numbers) {
        int num;
        boolean isExcluded;
        do{
            isExcluded = false;
            num = 1 + (int)(Math.random() * 5);
            for (int e: numbers) {
                if (num == e)
                    isExcluded = true;
            }
        } while (isExcluded);
        return num;
    }
}


/*
(Random number chooser) Write the following method that returns a random
number between start and end, excluding the numbers.
public static int getRandom(int start, int end, int... numbers)
 For example, invoking getRandom(1,100,4,8,95,93) returns a random number between 1 and 100 excluding 4,8,95,and 93. Write a test program that
invokes getRandom(1,100,4,8,95,93) 45 times and displays the resulting
numbers 15 per line using the format %4d.
 */
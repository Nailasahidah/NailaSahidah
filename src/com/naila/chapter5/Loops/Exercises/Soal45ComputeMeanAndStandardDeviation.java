package com.naila.chapter5.Loops.Exercises;

import java.util.Scanner;

public class Soal45ComputeMeanAndStandardDeviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mean,
                deviation,
                number;
        mean = deviation = 0;

        System.out.print("Enter 10 numbers: ");

        for (int i = 1; i <= 10; i++) {
            number = input.nextDouble();
            mean += number;
            deviation += Math.pow(number, 2);
        }
        deviation =  Math.sqrt((deviation - (Math.pow(mean, 2) / 10)) / (10 - 1));
        mean /= 10;

        System.out.println("The mean is " + mean);
        System.out.printf("The standard deviation is %.5f\n", deviation);
    }
}


/*(Statistics: compute mean and standard deviation) In business applications, you
are often asked to compute the mean and standard deviation of data. The mean is
simply the average of the numbers. The standard deviation is a statistic that tells
you how tightly all the various data are clustered around the mean in a set of data.
For example, what is the average age of the students in a class? How close are the
ages? If all the students are the same age, the deviation is 0.
Write a program that prompts the user to enter 10 numbers and displays the
mean and standard deviations of these numbers using the following formula:
mean = ani=1 xi n = x1 + x2 +ng + xn deviation = cani=1 xi2 - a ani=1 xib 2 n n - 1
Here is a sample run:
Enter 10 numbers: 1 2 3 4.5 5.6 6 7 8 9 10
The mean is 5.61
The standard deviation is 2.99794

 */
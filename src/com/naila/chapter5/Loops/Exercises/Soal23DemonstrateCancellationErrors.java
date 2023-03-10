package com.naila.chapter5.Loops.Exercises;

public class Soal23DemonstrateCancellationErrors {
    public static void main(String[] args) {
        double sumLeftToRight = 0.0;
        for (double i = 1.0; i <= 50000.0; i++) {
            sumLeftToRight += 1 / i;
        }
        System.out.println("Summation of series left to right: " + sumLeftToRight);

        double sumRightToLeft = 0.0;
        for (double i = 50000.0; i >= 1.0; i--) {
            sumRightToLeft += 1 / i;
        }
        System.out.println("Summation of series right to left: " + sumRightToLeft);
        System.out.println("Summation of the series right to left - "
                + "Summation of the series left to right: "
                + (sumRightToLeft - sumLeftToRight));
    }
}
/*(Demonstrate cancellation errors) A cancellation error occurs when you are
manipulating a very large number with a very small number. The large number
may cancel out the smaller number. For example, the result of 100000000.0
+ 0.000000001 is equal to 100000000.0. To avoid cancellation errors and
obtain more accurate results, carefully select the order of computation. For example, in computing the following summation, you will obtain more accurate
results by computing from right to left rather than from left to right:
1 + 12 + 13 + c + 1n
 Write a program that compares the results of the summation of the preceding
series, computing from left to right and from right to left with n = 50000.

 */
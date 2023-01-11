package com.naila.chapter5.Loops.Exercises;

public class Soal25ComputePI {
    public static void main(String[] args) {
        double sum = 0;
        double value = 10000.0;
        for (double d = 1; d <= (2 * value - 1); d += 2) {
            sum += 1 / d;
            d += 2;
            sum -= 1 / d;
        }
        double pi = 4 * sum;

        System.out.println("PI value for i = 10000: " + pi);

        sum = 0;
        value = 20000.0;
        for (double d = 1; d <= (2 * value - 1); d += 2) {
            sum += 1 / d;
            d += 2;
            sum -= 1 / d;
        }
        pi = 4 * sum;

        System.out.println("PI value for i = 20000: " + pi);

        sum = 0;
        value = 100000.0;
        for (double d = 1; d <= (2 * value - 1); d += 2) {
            sum += 1 / d;
            d += 2;
            sum -= 1 / d;
        }
        pi = 4 * sum;

        System.out.println("PI value for i = 100000: " + pi);
    }
}
/*(Compute p) You can approximate p by using the following summation:
p = 4 a1 - 13 + 15 - 17 + 19 - 111 + g + (-)i+1 2i - 1 b
 Write a program that displays the p value for i = 10000, 20000, …, and 100000.

 */
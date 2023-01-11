package com.naila.chapter5.Loops.Exercises;

public class Soal13Largest {
    public static void main(String[] args) {
        int n = 0;

        while (Math.pow(n+1, 3) < 12000) {
                n++ ;
            }
            System.out.println("The Largest integer n such that n^3 is less than 12,000: " + n);
    }
}

/*(Find the largest n such that n3 6 12,000) Use a while loop to find the largest
integer n such that n3
 is less than 12,000.

 */

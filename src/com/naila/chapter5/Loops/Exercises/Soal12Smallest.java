package com.naila.chapter5.Loops.Exercises;

public class Soal12Smallest {
    public static void main(String[] args) {
        int n = 0;

       while (Math.pow(n, 2) <= 12000) {
           while (Math.pow(n, 2) < 12000) {
               n++ ;
           }
           System.out.println("The smallest integer n such that n^2 is grater than 12,000: " + n);
       }

    }
}


/*(Find the smallest n such that n2 7 12,000) Use a while loop to find the smallest integer n such that n2
 is greater than 12,000.

 */
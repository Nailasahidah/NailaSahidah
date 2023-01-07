package com.naila.chapter5.tugas;

public class Soal3 {
    public static void main(String[] args) {
        final double POUNDS_PER_KILOGRAM = 2.2 ;
        System.out.println("Kilograms pounds") ;
        for (int i = 1; i <= 199; i += 2) {
            System.out.printf("%-15d%6.1f\n", i, (i * POUNDS_PER_KILOGRAM)) ;

        }
    }
}

/*(Conversion from kilograms to pounds) Write a program that displays the following table (note 1 kilogram is 2.2 pounds):
Kilograms Pounds
1           2.2
3           6.6
. . .
197         433.4
199         437.8
*/

package com.naila.chapter2.ElementaryProgramming.Ujian;
import java.util.Scanner ;
public class Soal3SumDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter a number betwen 1000 and 9999: ") ;
        int number = input.nextInt() ;

        int lessThan10 = number % 10 ;
        number /= 10 ;

        int tens = number % 10 ;
        number /= 10 ;

        int hundreds = number % 10;
        number /= 10 ;

        int thousand = number % 10 ;
        number /= 10 ;

        int sum = thousand + hundreds + tens + lessThan10  ;
        System.out.println("the sumof the digits is " + sum) ;
    }
}

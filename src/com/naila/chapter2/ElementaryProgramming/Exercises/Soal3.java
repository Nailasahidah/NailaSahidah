package com.naila.chapter2.ElementaryProgramming.Exercises;
import java.util.Scanner ;
public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        double MeterPerFoot = 0.305;
        System.out.print(" Enter a value for feet: ");
        double feet = input.nextDouble() ;

        double meters = feet * 0.305 ;
        System.out.println(+ feet + " feet is " + meters + " meters "  ) ;
    }
}

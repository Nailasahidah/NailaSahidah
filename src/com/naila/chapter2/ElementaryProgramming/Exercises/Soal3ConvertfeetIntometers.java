package com.naila.chapter2.ElementaryProgramming.Exercises;
import java.util.Scanner ;
public class Soal3ConvertfeetIntometers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        double MeterPerFoot = 0.305;
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble() ;

        double meters = feet * MeterPerFoot ;
        System.out.println(+ feet + " feet is " + meters + " meters "  ) ;
    }
}

// Enter a value for feet: 16.5
// 16.5 feet is 5.0325 meters
package com.naila.chapter1.JavaProgram.Exercises;

public class Soal13Solve2x2LinearEquations {
    public static void main(String[] args) {

        // Variables for Cramer`s formula
        double a = 3.4 ;
        double b = 50.2 ;
        double c = 2.1 ;
        double d = 0.55 ;
        double e = 44.5 ;
        double f = 5.9 ;

        double x = (e * d - b * f) / (a * d - b * c) ;
        double y = (a * f - e * c) / (a * d - b * c) ;

        System.out.println("x = " + x + " y = " + y) ;
    }
}

// x = 2.623901496861419 y = 0.7087397392563978
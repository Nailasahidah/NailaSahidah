package com.naila.chapter2.ElementaryProgramming.Exercises;
import java.util.Scanner ;
public class Soal14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble() ;
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble() ;

        weight = weight * KILOGRAMS_PER_POUND ;
        height = height * METERS_PER_INCH ;

        double bodyMassIndex = weight / Math.pow(height, 2) ;

        System.out.println("BMI is " + String.format("%.4f", bodyMassIndex) );
    }
}

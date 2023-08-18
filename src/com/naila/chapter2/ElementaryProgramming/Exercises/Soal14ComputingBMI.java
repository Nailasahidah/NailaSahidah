package com.naila.chapter2.ElementaryProgramming.Exercises;
import java.util.Scanner ;
public class Soal14ComputingBMI {
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

//Enter weight in pounds: 95.5
//Enter height in inches: 50
//BMI is 26.8573
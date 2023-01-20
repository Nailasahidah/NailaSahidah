package com.naila.chapter2.ElementaryProgramming.Exercises;
import java.util.Scanner ;
public class Soal1ConvertCelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter a degree in Celcius: ");
        double celcius = input.nextDouble() ;

        // Convert Celcius to Fahrenheit
        double fahrenheit = (9.0 / 5) * celcius + 32 ;
        System.out.println( + celcius + " Celcius is " + fahrenheit + " Fahrenheit") ;
    }
}

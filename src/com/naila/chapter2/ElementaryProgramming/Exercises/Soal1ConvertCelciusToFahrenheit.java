package com.naila.chapter2.ElementaryProgramming.Exercises;
import java.util.Scanner ;
public class Soal1ConvertCelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble() ;

        // Convert Celsius to Fahrenheit
        double fahrenheit = (9.0 / 5) * celsius + 32 ;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit") ;
    }
}

//Enter a degree in Celsius: 43.5
//43.5 Celsius is 110.3 Fahrenheit
package com.naila.chapter2.ElementaryProgramming.Latihan;
import java.util.Scanner ;
public class Listing6FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter a degree in Fahrenheit: ") ;
        double fahrenheit = input.nextDouble() ;

        double celsius = (5.0 / 9) * (fahrenheit - 32) ;
        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius") ;
    }
}

// Enter a degree in Fahrenheit: 100
// Fahrenheit 100.0 is 37.77777777777778 in Celsius
package com.naila.Chapter6.Methods.Exercises;

public class Soal8_KonversiAntaraCelciusDanFahrenheit {
    public static void main(String[] args) {
        System.out.println("Celcius   Fahrenheit   |   Fahrenheit   Celcius\n" +
                        "----------------------------------------------------");
        for (double celcius = 40.0, fahrenheit = 120.0;
        celcius >= 31.0; celcius--, fahrenheit -= 10){
            System.out.printf("%-12.1f", celcius);
            System.out.printf("%-15.1f|", celciusToFahrenheit(celcius));
            System.out.printf("   %-15.1f", fahrenheit);
            System.out.printf("%-7.2f\n\n", fahrenheitToCelcius(fahrenheit));
        }
    }
    public static double celciusToFahrenheit(double celcius){
        return (9.0 / 5) * celcius + 32 ;
    }
    public static double fahrenheitToCelcius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32) ;
    }
}

package com.naila.chapter2.ElementaryProgramming.Latihan;
import java.util.Scanner;
public class Listing3ComputeAverage {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in) ;
            System.out.print("Enter three numbers: ") ;

            double number1 = input.nextDouble() ;
            double number2 = input.nextDouble() ;
            double number3 = input.nextDouble() ;

            double average = (number1 + number2 + number3) / 3 ;

            System.out.println("The average of " + number1 + " "
                    + number2 + " " + number3 + " is " + average) ;
        }
}

// Enter three numbers: 3 4 5
// The average of 3.0 4.0 5.0 is 4.0
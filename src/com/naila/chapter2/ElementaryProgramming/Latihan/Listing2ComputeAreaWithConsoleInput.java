package com.naila.chapter2.ElementaryProgramming.Latihan;
import java.util.Scanner;

public class Listing2ComputeAreaWithConsoleInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter a number for radius: ") ;

        double radius = input.nextDouble() ;
        double area = radius * radius * 3.14159 ;
        System.out.println("The area for the circle of radius " + radius + " is " + area) ;
    }
}

// Enter a number for radius: 2.5
// The area for the circle of radius 2.5 is 19.6349375
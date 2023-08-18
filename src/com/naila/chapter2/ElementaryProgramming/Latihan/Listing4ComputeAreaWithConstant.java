package com.naila.chapter2.ElementaryProgramming.Latihan;
import java.util.Scanner ;
public class Listing4ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble() ;

        double area = radius * radius * PI ;

        System.out.println("The area for the circle of radius " + radius + " is " + area) ;
    }
}

// Enter a number for radius: 107
// The area for the circle of radius 107.0 is 35968.06391
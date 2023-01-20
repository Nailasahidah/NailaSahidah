package com.naila.chapter2.ElementaryProgramming.Exercises;
import java.util.Scanner ;
public class Soal23CostOfDriving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter the driving distance: ") ;
        double distance = input.nextDouble() ;
        System.out.print("Enter miles per galon: ") ;
        double milesPerGalon = input.nextDouble() ;
        System.out.print("Enter price per galon: ") ;
        double pricePerGalon = input.nextDouble() ;

        double costOfDriving = (distance / milesPerGalon) * pricePerGalon ;
        System.out.println("The cost of driving is " + String.format("%.2f",costOfDriving) ) ;
    }
}

package com.naila.chapter2.ElementaryProgramming.Latihan;
import java.util.Scanner ;
public class Listing8SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter purchase amount: ") ;
        double purchaseAmount = input.nextDouble() ;

        double tax = purchaseAmount * 0.06 ;
        System.out.println("Sales tax is $"  + (int)(tax * 100) / 100.0) ;

    }
}

// Enter purchase amount: 197.55
// Sales tax is $11.85
package com.naila.chapter2.ElementaryProgramming.Exercises;
import java.util.Scanner ;
public class Soal13CompoundValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        final double MONTHLY_INTEREST_RATE = 0.00417 ;

        System.out.print("Enter the monthly saving amount: ") ;
        double savingAmount = input.nextDouble() ;
        double total = savingAmount * (1 + MONTHLY_INTEREST_RATE) ;
        total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE) ;
        total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE) ;
        total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE) ;
        total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE) ;
        total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE) ;

        System.out.println("After the sixth month, the account value is $"+ String.format("%.2f", total) );
    }
}

//Enter the monthly saving amount: 100
//After the sixth month, the account value is $608.82
package com.naila.chapter2.ElementaryProgramming.Exercises;
import java.util.Scanner ;
public class Soal21CalculateFutureInvestmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter investment amount :") ;
        double amount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage :") ;
        double monthlyInterestRate = input.nextDouble() ;
        monthlyInterestRate /= 1200 ;
        System.out.print("Enter number of years :") ;
        int Years = input.nextInt() ;

        double futureInvestmentValue = amount * Math.pow(1 + monthlyInterestRate, Years * 12) ;
        System.out.print("Future value is $" + futureInvestmentValue) ;
    }
}

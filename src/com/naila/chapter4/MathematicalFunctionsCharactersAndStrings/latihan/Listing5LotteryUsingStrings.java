package com.naila.chapter4.MathematicalFunctionsCharactersAndStrings.latihan;

import java.util.Scanner;

public class Listing5LotteryUsingStrings {
    public static void main(String[] args) {
        String lottery = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10) ;
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter your lottery pick (two digits): ");
        String guess = input.nextLine() ;
    }
}

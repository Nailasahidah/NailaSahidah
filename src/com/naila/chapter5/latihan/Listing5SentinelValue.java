package com.naila.chapter5.latihan;

import java.util.Scanner;

public class Listing5SentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        //Read initial data
        System.out.print(
                "Enter an integer (the input ends if it is 0) : ") ;
        int data = input.nextInt() ;

        //Keep reading dat until the input is 0
        int sum = 0 ;
        while (data != 0){
            sum += data ;

            //Read the next data
            System.out.print(
                    "enter an integer (the input ends if it is 0) : ") ;
            data = input.nextInt() ;
        }

        System.out.println("The sum is " + sum) ;
    }
}

package com.naila.chapter2.ElementaryProgramming.Exercises;
import java.util.Scanner ;
public class Soal4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in) ;

        double kilogramPerPound = 0.454;

        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble() ;

        double kilograms = pounds * kilogramPerPound ;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms" ) ;


    }
}

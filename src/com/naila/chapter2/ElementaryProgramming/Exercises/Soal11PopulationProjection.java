package com.naila.chapter2.ElementaryProgramming.Exercises;
import java.util.Scanner;
public class Soal11PopulationProjection {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter the number of years:") ;
        int years = input.nextInt() ;

        int population = 321032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * years);

        System.out.println("The population in " + years + " years is " + population) ;
    }

}

//Enter the number of years:5
//The population in 5 years is 334932966
package com.naila.chapter2.ElementaryProgramming.Exercises;
import java.util.Scanner ;
public class Soal2ComputeTheVolumeOfACylinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter the radius and length of cylinder: ") ;
        double radius = input.nextDouble() ;
        double length = input.nextDouble () ;
        double PI = 3.14159 ;
        double area = radius * radius * PI ;
        double volume = area * length ;


        System.out.println("The area is " + String.format("%.2f", area) );
        System.out.println("The volume is " + String.format("%.2f", volume) );


    }
}

//Enter the radius and length of cylinder: 5.5 12
//The area is 95.03
//The volume is 1140.40
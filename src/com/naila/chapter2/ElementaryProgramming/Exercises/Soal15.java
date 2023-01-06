package com.naila.chapter2.ElementaryProgramming.Exercises;
import java.util.Scanner ;
public class Soal15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;

        System.out.print("Enter x1 and y1: ") ;
        double x1 = in.nextDouble() ;
        double y1 = in.nextDouble() ;

        System.out.print("Enter x2 and y2:");
        double x2 = in.nextDouble() ;
        double y2 = in.nextDouble() ;

        double determinant = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) ;
        double sqrRoot = Math.pow(determinant, 0.5);

        System.out.printf("The distance between the two points is %f", sqrRoot) ;
    }
}

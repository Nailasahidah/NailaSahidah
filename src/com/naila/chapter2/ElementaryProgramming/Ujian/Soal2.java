package com.naila.chapter2.ElementaryProgramming.Ujian;
import java.util.Scanner ;
public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        double rupiahPerDollars = 15.66550 ;
        System.out.print("Masukan nilai dalam rupiah: ") ;

        double rupiah = input.nextDouble() ;
        double dollars = rupiah / rupiahPerDollars ;


        System.out.println(rupiah + " rupiah adalah $ " + String.format("%.2f", dollars)) ;
    }
}

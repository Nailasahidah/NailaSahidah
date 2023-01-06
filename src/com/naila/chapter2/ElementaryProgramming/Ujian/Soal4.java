package com.naila.chapter2.ElementaryProgramming.Ujian;
import java.util.Scanner ;
public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Masukan tinggi badan anda: ") ;
        double tinggiBadan = input.nextDouble() ;


        double beratBadanIdeal =(tinggiBadan - 100) - (0.15 * (tinggiBadan  - 100)) ;


        System.out.print("Masukan berat badan: ") ;
        double beratBadan = input.nextDouble() ;
        double BMI = beratBadan / Math.pow(tinggiBadan/ 100, 2) ;

        System.out.println("berat badan ideal anda adalah " + String.format("%.2f", beratBadanIdeal)+ " Kg" ) ;
        System.out.println("Nilai BMI tubuh anda adalah " + String.format("%.2f", BMI )) ;
    }
}

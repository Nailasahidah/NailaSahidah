package com.naila.chapter3.Selections.Ujian;

import java.util.Scanner;

public class Soal1BMIJenisKelamin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Masukan jenis kelamin anda (L/P) : ") ;
        String jenisKelamin = input.nextLine() ;
        System.out.print("Masukan Tinggi badan Anda dalam cm : ") ;
        double tinggiBadan = input.nextDouble() ;
        System.out.print("Masukan berat badan Anda dalam kg : ") ;
        double beratBadan = input.nextDouble();

        double meter = tinggiBadan / 100 ;
        double BMI = beratBadan / Math.pow(tinggiBadan / 100, 2) ;
        double brocaL = (tinggiBadan - 100) - (0.10 * (tinggiBadan - 100)) ;
        double brocaP = (tinggiBadan - 100) - (0.15 * (tinggiBadan - 100)) ;


        System.out.print("Jenis kelamin anda adalah ");
        switch (jenisKelamin ) {
            case "p" :
                System.out.print("perempuan");
                System.out.print(", maka berat badan ideal anda adalah " + brocaP +" Kg") ; break;
            case "l" :
                System.out.print("lakilaki") ;
                System.out.print(", maka berat badan ideal anda adalah " + brocaL + " Kg") ; break;

        }

        System.out.print("\nNilai BMI tubuh Anda adalah " + String.format("%.2f",BMI ) + ", maka kategori tubuh anda adalah ") ;

        if (BMI < 18.5)
            System.out.print("Kurus") ;
        else if ( BMI < 25)
            System.out.print("Normal") ;
        else if ( BMI < 30)
            System.out.print("Badan") ;
        else
            System.out.print("Obesitas") ;

    }
}

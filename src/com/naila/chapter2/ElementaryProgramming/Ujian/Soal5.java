package com.naila.chapter2.ElementaryProgramming.Ujian;
import java.util.Scanner ;
public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Masukan jarak perjalanan anda: ") ;
        double jarakPerjalanan = input.nextDouble() ;

        System.out.print("Masukan konsumsi bahan bakar dalam kilometer per liter: ") ;
        double konsumsiBahanBakar = input.nextDouble() ;

        System.out.print("Masukkan harga bahan bakar: ") ;
        double harga = input.nextDouble() ;

        double totalBiayaPerjalanan = jarakPerjalanan / konsumsiBahanBakar * harga ;
        System.out.println("Maka total biaya perjalanan anda dalam "+ jarakPerjalanan + " Km adalah Rp " + String.format("%.2f", totalBiayaPerjalanan)) ;

    }
}

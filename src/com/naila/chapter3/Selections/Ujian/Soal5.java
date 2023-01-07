package com.naila.chapter3.Selections.Ujian;
import java.util.Scanner ;
public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Nama sales") ;
        String namaSales = input.nextLine();
        System.out.println("Masukan Jumlah Penjualan Sales hari ini : ") ;
        int pendapatan = input.nextInt();
        int jasa ;
        double  komisi;



        if (pendapatan >= 0 && pendapatan <=200000) {
            jasa = 10000 ;
            komisi = 0.1 * pendapatan ;
        }
        else {
            if (pendapatan <= 500000) {
                jasa = 20000 ;
                komisi = 0.15 * pendapatan ;
            }
            else
            {
                jasa = 30000 ;
                komisi = 0.20 * pendapatan ;
            }
        }

        double total = komisi + jasa ;
        System.out.println("Nama Sales " + namaSales) ;
        System.out.println("Selamat, total penjualan anda hari ini adalah " + pendapatan) ;
        System.out.println("Anda berhak mendapatkan komisi " + komisi + " dan uang jasa " + jasa) ;
        System.out.println("Total pendapatan anda hari ini adalah " + total) ;


    }

}

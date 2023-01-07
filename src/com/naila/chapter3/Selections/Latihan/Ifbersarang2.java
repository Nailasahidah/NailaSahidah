package com.naila.chapter3.Selections.Latihan;
import java.util.Scanner ;
public class Ifbersarang2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Masukan nilai ujian anda: ") ;
        int nilaiUjian = input.nextInt() ;
        char indeksPrestasi;

        if (nilaiUjian >= 90) {
            indeksPrestasi = 'A' ;
        }else if (nilaiUjian >=80) {
            indeksPrestasi = 'B' ;
        }else if (nilaiUjian >=70) {
            indeksPrestasi = 'C' ;
        }else if (nilaiUjian >=60) {
            indeksPrestasi = 'D' ;
        }else if (nilaiUjian >=50) {
            indeksPrestasi = 'E' ;
        }else {
            indeksPrestasi = 'F' ;
        }

        System.out.println("Nilai Ujian Akhir Anda Adalah " + indeksPrestasi) ;
    }
}

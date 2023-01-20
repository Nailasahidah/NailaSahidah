package com.naila.chapter3.Selections.Ujian;
import java.util.Scanner ;
public class Soal2AplikasiPenilaianNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Aplikasi Penilaian (Rentang nilai 0 - 100)") ;
        System.out.print("Masukan Nilai Kehadiran : ") ;
        double nK = input.nextDouble();
        System.out.print("Masukan Nilai Tugas : ") ;
        double nT = input.nextDouble() ;
        System.out.print("Masukan Nilai UTS : ") ;
        double nUT = input.nextDouble() ;
        System.out.print("Masukan Nilai UAS : ") ;
        double nUA = input.nextDouble() ;
        System.out.print("Masukan Nilai Project Akhir : ") ;
        double nPA = input.nextDouble() ;


        double nilaiAkhir = (nK * 0.05) + (nT * 0.20) + (nPA * 0.3) + (nUT * 0.20) + (nUA * 0.25) ;
        int indexNilai ;

        if (nilaiAkhir >= 90) {
            System.out.println("Selamat Anda Lulus dengan nilai A");
        }else if (nilaiAkhir >= 85) {
            System.out.println("Selamat Anda Lulus dengan nilai B+");
        }else if (nilaiAkhir >= 80) {
            System.out.println("Selamat Anda Lulus dengan nilai B");
        }else if (nilaiAkhir >= 75) {
            System.out.println("Selamat Anda Lulus dengan nilai B-");
        }else if (nilaiAkhir >= 70) {
            System.out.println("Selamat Anda Lulus dengan nilai C+");
        }else if (nilaiAkhir >= 65) {
            System.out.println("Selamat Anda Lulus dengan nilai C");
        }else if (nilaiAkhir >= 60) {
            System.out.println("Selamat Anda Lulus dengan nilai C-");
        }else if (nilaiAkhir > 50) {
            System.out.println("Nilai Anda D dinyatakan Tidak Lulus\nAnda harus mengulang matakuliah ini");
        }else if (nilaiAkhir < 50) {
            System.out.println("Nilai Anda E dinyatakan Tidak Lulus\nAnda harus mengulang matakuliah ini");

        }
    }

}

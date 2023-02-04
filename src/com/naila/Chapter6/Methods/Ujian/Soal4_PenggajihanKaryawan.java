package com.naila.Chapter6.Methods.Ujian;

import java.util.Scanner;

public class Soal4_PenggajihanKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Nama Karyawan       : ");
        String namaKaryawan = input.nextLine();
        System.out.print("Status              : ");
        String status = input.nextLine();
        System.out.print("Jumlah Anak         : ");
        int jumlahAnak = input.nextInt();
        System.out.print("Jarak rumah-Kantor dalam KM : ");
        int jarak = input.nextInt();
        System.out.print("Jumlah Masuk kerja  : ");
        int hariKerja = input.nextInt();
        System.out.print("Tahun Masuk         : ");
        int tahunMasuk = input.nextInt();
        System.out.print("Masukan gajih pokok : ");
        int gajiPokok = input.nextInt();

        System.out.println("------------------------------------------------------------------------------------------------" +
                           "\n                           Slip Gaji Karyawan Bulan Februari 2023 " +
                           "\n------------------------------------------------------------------------------------------------");
        System.out.print("Nama Karyawan               : " + namaKaryawan);
        System.out.print("\nStatus                      : " + status);
        System.out.print("\nJumlah Anak                 : " + jumlahAnak);
        System.out.print("\nJarak rumah-Kantor          : " + jarak + " KM");
        System.out.print("\nJumlah Masuk kerja          : " + hariKerja + " Hari");
        System.out.print("\nTahun Masuk                 : " + tahunMasuk);
        System.out.println();

        System.out.println("\n------------------------------------------------------------------------------------------------");
        System.out.println("      Gaji Pokok      |      T.Keluarga      |     T.perusahaan      |      T.kesehatan");
        System.out.println("------------------------------------------------------------------------------------------------");

        System.out.print("       " + gajiPokok);
        System.out.print("       |        ");
        System.out.print(status(status,jumlahAnak,gajiPokok));
        System.out.print("      |        ");
        System.out.print(jarak(jarak,hariKerja));
        System.out.print("       |        ");
        System.out.print(tahun1(tahunMasuk)) ;

        int totalGaji =(int)(gajiPokok + status(status,jumlahAnak,gajiPokok) + jarak(jarak,hariKerja) + tahun1(tahunMasuk));
        System.out.println("\n------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("Total Gaji bulan Februari adalah " + totalGaji);
        System.out.println("------------------------------------------------------------------------------------------------");
    }
    public static double status (String status, int anak, int gajiPokok) {
        switch (status) {
            case "Belum menikah" :
                return 0;

            case "Menikah":
                if (anak <= 0) {
                    return 5 / 100.0 * gajiPokok;
                } else if (anak >= 1 && anak <= 3) {
                    return 7.5 / 100.0 * gajiPokok;
                } else if (anak >= 4) {
                    return 10 / 100.0 * gajiPokok;
                } else
                    break;
            case "Duda":
                if (anak >= 1) {
                    return 5 / 100.0 * gajiPokok;
                } else if (anak <= 0){
                    return 3 / 100.0 * gajiPokok;
                }else
                    break;
            case "Janda":
                if (anak >= 1) {
                    return 7.5 / 100.0 * gajiPokok;
                } else
                    return 5 / 100.0 * gajiPokok;
        }
        return 0;
    }
    public static double jarak(int jarak, int masuk) {
            if (jarak >= 5 && jarak <= 10 ) {
                return 10000 * masuk;
            }
            else if (jarak >= 11) {
                return 15000 * masuk;
            }else
                return 5000 * masuk;
    }
    public static double tahun1 (double tahun) {
        double tahun1 = 2023 - tahun;
        if (tahun1 > 5) {
            return 750000 ;
        }
        else if (tahun1 >=2 && tahun1 <= 5) {
            return 500000 ;
        }else
            return 200000 ;
    }
}
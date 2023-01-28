package com.naila.Chapter6.Methods.Ujian;

import java.util.Scanner;

public class Soal4_PenggajihanKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Nama Karyawan       : ");
        String nama = input.nextLine();
        System.out.print("Status              : ");
        String status = input.nextLine();
        System.out.print("Jumlah Anak         : ");
        int anak = input.nextInt();
        System.out.print("Jarak rumah-Kantor dalam KM : ");
        int jarak = input.nextInt();
        System.out.print("Jumlah Masuk kerja  : ");
        int masuk = input.nextInt();
        System.out.print("Tahun Masuk         : ");
        int tahun = input.nextInt();

        int gajiPokok = 10000000;

        System.out.println("------------------------------------------------------------------" +
                           "\n           Slip Gaji Karyawan Bulan Februari 2023 " +
                           "\n------------------------------------------------------------------");
        System.out.print("Nama Karyawan               : " + nama);
        System.out.print("\nStatus                      : " + status);
        System.out.print("\nJumlah Anak                 : " + anak);
        System.out.print("\nJarak rumah-Kantor          : " + jarak + " KM");
        System.out.print("\nJumlah Masuk kerja          : " + masuk + " Hari");
        System.out.print("\nTahun Masuk                 : " + tahun);
        System.out.println();

        System.out.println("\n------------------------------------------------------------------------------------------------");
        System.out.println("      Gaji Pokok      |      T.Keluarga      |     T.perusahaan      |      T.kesehatan");
        System.out.println("------------------------------------------------------------------------------------------------");

        System.out.print("       " + gajiPokok);
        System.out.print("       |        ");
        System.out.print(status(status,anak,gajiPokok));
        System.out.print("      |        ");
        System.out.print(jarak(jarak,masuk));
        System.out.print("       |        ");
        System.out.print(tahun1(tahun)) ;

        int totalGaji =(int)(gajiPokok + status(status,anak,gajiPokok) + jarak(jarak,masuk) + tahun1(tahun));
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
                    return 5 / 100 * gajiPokok;
                } else if (anak > 1 && anak <= 3) {
                    return 7.5 / 100 * gajiPokok;
                } else if (anak > 3) {
                    return 10 / 100 * gajiPokok;
                } else
                    break;
            case "Duda":
                if (anak > 1) {
                    return 5 / 100 * gajiPokok;
                } else if (anak <= 0){
                    return 3 / 100 * gajiPokok;
                }else
                    break;


            case "Janda":
                if (anak > 1) {
                    return 7.5 / 100 * gajiPokok;
                } else
                    return 5 / 100 * gajiPokok;

        }
        return 0;
    }
    public static double jarak(int jarak, int masuk) {
            if (jarak >= 5 && jarak < 10 ) {
                return 10000 * masuk;
            }
            else if (jarak >= 10) {
                return 15000 * masuk;
            }else
                return 5000 * masuk;
    }
    public static double tahun1 (double tahun) {
        double tahun1 = 2023 - tahun;
        if (tahun1 > 5) {
            return 750000 ;
        }
        else if (tahun >=2 || tahun <= 5) {
            return 500000 ;
        }else
            return 200000 ;
    }
}

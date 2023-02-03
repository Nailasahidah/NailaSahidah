package com.naila.Chapter6.Methods.Ujian;

import java.util.Scanner;

public class BahasPenggajian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Bulan          : ");
        String bulan = input.next();
        System.out.print("Tahun               : ");
        String tahun = input.next();
        System.out.print("Nama Karyawan       : ");
        String nama = input.nextLine();
        System.out.print("Status              : ");
        String status = input.nextLine();
        System.out.print("Jumlah Anak         : ");
        int anak = input.nextInt();
        System.out.print("Jarak rumah-Kantor dalam KM : ");
        int jarak = input.nextInt();
        System.out.print("Jumlah Masuk kerja  : ");
        int jumlahHari = input.nextInt();
        System.out.print("Tahun Masuk         : ");
        int tahunMasuk = input.nextInt();
        System.out.print("Gaji Pokok          : ");
        int gajiPokok = input.nextInt();

    }
    private static double tunjanganTransportasi ( int jumlahHari, int jarak){
        double tunjanganTransportasi = 0;

        if (jarak < 5) {
            tunjanganTransportasi = jumlahHari * 5_000;
        } else if (jarak <= 10) {
            tunjanganTransportasi = jumlahHari * 10_000;
        } else if (jarak > 10) {
            tunjanganTransportasi = jumlahHari * 15_000;
        } else {
            System.out.println("Error");
        }

        return 0;
    }
    private static int tunjanganKesehatan ( int tahunMasuk) {
        int tahunIni = 2023;
        int tunjanganKesehatan =0;
        int lamaKerja = tahunIni - tahunMasuk ;
        if (lamaKerja < 2) {
            tunjanganKesehatan = 200_000;
        }
        return tunjanganKesehatan ;
    }
}
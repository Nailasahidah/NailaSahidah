package com.naila.Chapter7.SingleDimensionalArrays.Ujian;

import java.util.Scanner;

public class Soal1_RekapNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Program Aplikasi Rekap Nilai");
        System.out.print("\nInputkan jumlah siswa: ");
        String[] siswa = new String[input.nextInt()];
        int[] jumlah = new int[siswa.length];
        System.out.print("Inputkan jumlah mata pelajaran: ");
        String[] mapel = new String[input.nextInt()];
        int[] jmlmapel = new int[mapel.length];

        System.out.print("*** INPUT MATA PELAJARAN ***\n");
        for (int i = 0; i < mapel.length; i++) {
            System.out.print("Input mata pelajaran ");
            System.out.print("ke- " + (i + 1) + ": ");
            mapel[i] = input.next();
        }
        System.out.print("*** INPUT SISWA DAN NILAI SETIAP MATA PELAJARAN ***");
        for (int i = 0; i < siswa.length; i++) {
            System.out.print("\nInput Nama Siswa ke- " + (i + 1) + ": ");
            siswa[i] = input.next();
            for (int j = 0; j < mapel.length; j++) {
                System.out.print("Input Nilai ");
                System.out.print(mapel[j] + "" + ": ");
                String[] score = new String[input.nextInt()];
                int[][] nilai = new int[][]{new int[score.length]};
            }
        }
        System.out.println();
        System.out.print("*** DATA NILAI SISWA ***");
        System.out.print("\n------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.printf(" %-7s | %-18s | ", "No", "Nama Siswa");
        for (int j = 0; j < mapel.length; j++) {
            System.out.printf(" %-13s | ", mapel[j]);
        }
        System.out.printf("%-14s | %-14s | ", "Rata-rata", " Index ");
        System.out.printf(" %-18s | ", "keterangan");
        System.out.print("\n------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < siswa.length; i++) {
            System.out.printf("\n %-7s | %-18s |", (i + 1), siswa[i]);
        }
        System.out.print("\n-------------------------------------------------------------------------------------------------------------------------------------");
    }
        public static double indexNilai (int average) {
            if (average >= 80 && average <= 100) {
                return 'A';
            }
            else if (average >= 70 && average <= 79) {
                return 'B';
            }
            else if (average >= 60 && average <= 69) {
                return 'C';
            }
            else if (average >= 50 && average <= 59) {
                return 'D';
            }
            else return 'E';
        }
        public static double keterangan ( String indexNilai) {
            switch (indexNilai) {
                case "A" :
                    System.out.print("Lulus dengan baik"); break;
                case "B" :
                    System.out.print("Lulus"); break;
                case "D" :
                    System.out.print("Lulus dengan pertimbangan");break;
                case "C" :
                    System.out.println("Lulus dengan pertimbangan");break;
                case "E" :
                    System.out.print("Tidak lulus");
            }
            return 0;
        }
}

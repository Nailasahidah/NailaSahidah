package com.naila.Chapter9.ObjectAndClasses.Ujian_PBO.Soal5_Exception;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        int[] array = { 0, 1, 2, 3} ;

        Scanner input = new Scanner(System.in) ;
        System.out.print("Nilai array ke: ");
        int index = input. nextInt();
        System.out.printf("Index ke-%d, adalah %d\n", index, array[index]);

        // Jika terjadi error atau kesalahan inputan , maka program berhenti tiba-tiba
        System.out.println("Akhir program");
    }
}

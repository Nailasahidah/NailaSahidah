package com.naila.Chapter6.Methods.Latihan;

import java.util.Arrays;
import java.util.Scanner;

public class UrutAngkaArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Masukkan Jumlah angka: ");
        int jmlAngka = input.nextInt() ;
        int []arr = new int[jmlAngka] ;
        System.out.println("Masukan semua angka: ");

        for (int i = 0; i < jmlAngka; i++) {
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);
        for (int index:arr) {
            System.out.println("Telah diurutkan : " + index) ;
        }
    }
}

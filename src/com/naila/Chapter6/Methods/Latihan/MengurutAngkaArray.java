package com.naila.Chapter6.Methods.Latihan;

import java.util.Arrays;

public class MengurutAngkaArray {
    public static void main(String[] args) {
        int arr[] = {
                3, 5, 7, 8, 9, 4, 2, 6
        } ;
        System.out.println("Angka sebelum diurutkna: ");
        for (int i:arr) {
            System.out.println(i) ;
        }
        System.out.println();

        Arrays.sort(arr) ;

        System.out.println("Angka setelah diurutkan : ") ;
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

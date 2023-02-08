package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

import java.util.Scanner;

public class Soal2_ReserveTheNumbersEntered_MembalikAngkaYangDimasukkan {
    public static void main(String[] args) {
        int[] array = new int[10];

        System.out.print("Masukkan 10 angka: ");

        fill(array);

        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");
        System.out.println();
    }
    public static void fill(int[] array){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++)
            array[i] = input.nextInt();
    }
}

/*
(Balik angka yang dimasukkan) Tulis sebuah program yang membaca 10 bilangan bulat
kemudian menampilkannya dalam urutan terbalik dari pembacaannya.
 */
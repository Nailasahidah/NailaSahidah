package com.naila.Chapter7.SingleDimensionalArrays.Latihan;

public class Listing6_LinearSearch_PencarianLinear {
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
            return i;
        }
        return -1;
    }
}


/*
Pendekatan pencarian linier membandingkan kunci elemen kunci secara berurutan
dengan setiap elemen dalam larik.
Ini terus berlanjut hingga kunci cocok dengan elemen dalam larik,
atau larik habis tanpa ditemukannya matc.
Jika ada kecocokan, pencarian linier mengembalikan indeks elemen
dalam larik yang cocok dengan kuncinya. Jika tidak ditemukan kecocokan,
pencarian mengembalikan −1.
 */
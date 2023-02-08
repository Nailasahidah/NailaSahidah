package com.naila.Chapter7.SingleDimensionalArrays.Latihan;

public class Listing3_TestPassArray_UjianLulusArray {
    public static void main(String[] args) {
        int[] a = {1, 2};

        System.out.println("Before invoking swap"); //sebelum memanggil swap
        System.out.println("array is {" + a[0] + ", " + a[1] + "} ");
        swap(a[0], a[1]);
        System.out.println("After invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "} ");

        System.out.println("Before invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "} ");
        swapFirstTwoInArray(a) ;
        System.out.println("After invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "} ");
    }
    public static void swap(int n1, int n2) {
        int temp = n1 ;
        n1 = n2;
        n2 = temp;
    }
    public static void swapFirstTwoInArray(int[] array){
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}

/*
Program ini berisi dua metode untuk menukar elemen dalam array. Metode pertama,
bernama swap, gagal menukar dua argumen int. Metode kedua, bernama swapFirst TwoInArray,
berhasil menukar dua elemen pertama dalam argumen array.
Before invoking swap
array is {1, 2}
After invoking swap
array is {1, 2}
Before invoking swapFirstTwoInArray
array is {1, 2}
After invoking swapFirstTwoInArray
array is {2, 1}
 */

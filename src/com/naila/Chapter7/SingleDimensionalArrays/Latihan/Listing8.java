package com.naila.Chapter7.SingleDimensionalArrays.Latihan;

public class Listing8 {
    public static void main(String[] args) {
        int[] list = {2,4,5,6,7,8,4,3,2,7,9,4,5,5,6,7,8,1,1,1,3,3,5};
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i] ;
            int currentMinIndex = i;

            System.out.println();

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j] ;
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i] ;
                list[i] = (int)currentMin;
            }
            System.out.println("");

        }
    }
}

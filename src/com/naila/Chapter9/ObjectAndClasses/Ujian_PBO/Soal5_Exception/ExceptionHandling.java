package com.naila.Chapter9.ObjectAndClasses.Ujian_PBO.Soal5_Exception;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] array = { 0, 1, 2, 3} ;

        Scanner input = new Scanner(System.in) ;
        System.out.print("Nilai array ke: ");
        int index = input. nextInt();


        //Handling
        try {
            System.out.printf("Index ke-%d, adalah %d\n", index, array[index]);
        } catch (java.lang.Exception e) {
            System.out.println(e);
        }
        System.out.println("Akhir program");
    }
}

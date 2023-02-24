package com.naila.Chapter12.ContohException;

import java.io.FileInputStream;
import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3} ;

        Scanner input = new Scanner(System.in);
        System.out.print("Nilai array ke: ");
        int index = input.nextInt();

        // Exception handling (try, catch, finally)
        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
        } catch (Exception e) {
            System.out.println(e);
        }

        // runtime error jika file tidak ada

        FileInputStream fileInput = null;

        try {
            fileInput = new FileInputStream("input.txt");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("akhir dari program");
    }
}

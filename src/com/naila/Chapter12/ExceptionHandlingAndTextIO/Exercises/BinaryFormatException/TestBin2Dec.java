package com.naila.Chapter12.ExceptionHandlingAndTextIO.Exercises.BinaryFormatException;

import com.naila.Chapter12.ExceptionHandlingAndTextIO.Exercises.Bin2Dec;

import java.util.Scanner;

public class TestBin2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary: ");
        try {
            System.out.println(Bin2Dec.bin2Dec(input.nextLine()));
        }
        catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

package com.naila.Chapter17.BinaryIO.Exercises;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class SumAllTheIntegersInABinaryDataFile {
    public static void main(String[] args) throws IOException {
        int sum = 0;

        try (
                DataInputStream input =
                        new DataInputStream(new FileInputStream("Exercises17_03.dat"));
        ) {
            while (true)
                sum += input.readInt();
        }
        catch (EOFException ex) {
            System.out.println("Sum of the integers is: " + sum);
        }
    }
}

/*
(Sum all the integers in a binary data file) Suppose a binary data file named
Exercise17_02.dat has been created from Programming Exercise 17.2 and its data
are created using writeInt(int) in DataOutputStream. The file contains an
unspecified number of integers. Write a program to find the sum of the integers.
 */
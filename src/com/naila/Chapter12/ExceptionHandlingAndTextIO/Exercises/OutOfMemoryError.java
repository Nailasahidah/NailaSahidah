package com.naila.Chapter12.ExceptionHandlingAndTextIO.Exercises;

public class OutOfMemoryError {
    public static void main(String[] args) {
        int length = 1200000000;
        try {
            byte[] array = new byte[length];
        }
        catch (java.lang.OutOfMemoryError ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Error handled program continues...");
    }
}

package com.naila.Chapter12.ExceptionHandlingAndTextIO.Latihan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter an integers: ");
                int number = input.nextInt();

                System.out.println("The number entered is " + number);

                continueInput = false;
            }
            catch (InputMismatchException ex) {
                System.out.println("Try again. (" +
                        "Incorrect input: an integer is required)");
                input.nextLine();
            }
        } while (continueInput);
    }
}


/*
Enter an integers: 3.5
Try again. (Incorrect input: an integer is required)
Enter an integers: 4
The number entered is 4
 */
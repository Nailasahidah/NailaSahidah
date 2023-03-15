package com.naila.Chapter12.ExceptionHandlingAndTextIO.Exercises;

import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        boolean continueInput = true;

        System.out.print("Enter two numbers: ");
        do {
            try {
                int number1 = input.nextInt();
                int number2 = input.nextInt();

                System.out.println("The sum is " + (number1 + number2));

                continueInput = false;
            }
            catch (java.util.InputMismatchException ex) {
                System.out.println("Try again. (" + "Incorrect input: two integers are required) ");
                input.nextLine();
            }
        }while (continueInput);
    }
}

/*
Enter two numbers: 2.1 0
Try again. (Incorrect input: two integers are required)

Enter two numbers: 2 4
The sum is 6
 */
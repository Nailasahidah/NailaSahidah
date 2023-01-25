package com.naila.Chapter6.Methods.Exercises;

import java.util.Scanner;

public class Soal18CheckPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine() ;

        System.out.println(
                (isValidPassword(password) ? "Valid" : "Invalid ") + "Password");
    }
    public static boolean isValidPassword(String password) {
        final int LENGTH_OF_VALID_PASSWORD = 8;
        final int MINIMUM_NUMBER_OF_DIGITS = 2;

        boolean validPassword =
                isLengthValid(password, LENGTH_OF_VALID_PASSWORD) &&
                        isOnlyLettersAndDigits(password) &&
                        hasDigits(password, MINIMUM_NUMBER_OF_DIGITS);

        return validPassword;
    }
    public static boolean isLengthValid(String password, int validLength) {
        return password.length() >= validLength;
    }
    public static boolean isOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                    return false;
            }
        }
        return true;
    }

    public static boolean hasDigits(String password, int n) {
        int numberOfDigits = 0 ;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numberOfDigits++;
            }
            if (numberOfDigits >= n) {
                return true;
            }
        }
        return false;
    }
}


/*
(Check password) Some Websites impose certain rules for passwords. Write a
method that checks whether a string is a valid password. Suppose the password
rules are as follows:
■ A password must have at least eight characters.
■ A password must contain only letters and digits.
■ A password must contain at least two digits.
Write a program that prompts the user to enter a password and displays Valid
Password if the rules are followed, or Invalid Password otherwise.
 */
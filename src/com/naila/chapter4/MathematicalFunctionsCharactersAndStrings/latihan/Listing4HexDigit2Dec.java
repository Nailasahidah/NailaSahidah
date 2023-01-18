package com.naila.chapter4.MathematicalFunctionsCharactersAndStrings.latihan;

import java.util.Scanner;

public class Listing4HexDigit2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();

        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);
            }

        char ch = Character.toUpperCase(hexString.charAt(0));
        if ('A' <= ch && ch <= 'F') {
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit "
                    + ch + " is " + value);
            }
        else if (Character.isDigit(ch)) {
            System.out.println("The decimal value for hex digit "
                    + ch + " is " + ch);
            }
        else {
            System.out.println(ch + " is an invalid input");
        }
    }
}


/*Enter a hex digit: AB7C
You must enter exactly one character
Enter a hex digit: B
The decimal value for hex digit B is 11
Enter a hex digit: 8
The decimal value for hex digit 8 is 8
Enter a hex digit: T
T is an invalid input

 */
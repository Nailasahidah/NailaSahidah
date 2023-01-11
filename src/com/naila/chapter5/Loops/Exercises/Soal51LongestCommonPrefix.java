package com.naila.chapter5.Loops.Exercises;

import java.util.Scanner;

public class Soal51LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = input.nextLine();

        int index = 0;
        String prefix = "";

        while (string1.charAt(index) == string2.charAt(index)) {
            prefix += string1.charAt(index);
            index++;
        }

        if (prefix.length() > 0)
            System.out.println("The commmon prefix is " + prefix);
        else
            System.out.println(string1 + " and " + string2 +
                    " have no commmon prefix");
    }
}


/*(Longest common prefix) Write a program that prompts the user to enter two
strings and displays the largest common prefix of the two strings. Here are some
sample runs:
Enter the first string: Welcome to C++
Enter the second string: Welcome to programming
The common prefix is Welcome to
Enter the first string: Atlanta
Enter the second string: Macon
Atlanta and Macon have no common prefix

 */
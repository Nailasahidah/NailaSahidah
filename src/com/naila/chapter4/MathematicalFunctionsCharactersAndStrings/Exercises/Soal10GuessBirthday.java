package com.naila.chapter4.MathematicalFunctionsCharactersAndStrings.Exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Soal10GuessBirthday {
    public static void main(String[] args) {
        String set1 =
                " 1 3 5 7\n" + " 9 11 13 15\n" + " 17 19 21 23\n" + " 25 27 29 31" ;
        String set2 =
                " 2 3 6 7\n" + " 12 13 14 15\n" + " 20 21 22 23\n" + " 28 29 30 31" ;
        String set3 =
                " 8 9 10 11\n" + " 12 13 14 15\n" + " 24 25 26 27\n" + " 28 29 30 31" ;
        String set4 =
                " 8 9 10 11\n" + " 12 13 14 15\n" + " 24 25 26 27\n" + " 28 29 30 31" ;
        String set5 =
                " 16 17 18 19\n" + " 20 21 22 23\n" + " 28 29 30 31" ;
        int day = 0 ;

        Scanner input = new Scanner(System.in) ;
        System.out.print("Is your birthday in set1/\n") ;
        System.out.print(set1) ;
        System.out.print("\nEnter Y for Yes and N for No: ") ;
        String s = input.nextLine() ;
        char answer = s.charAt(0) ;

        if (Character.toUpperCase(answer) == 'Y') day += 1 ;

        System.out.print("Is your birthday in set2/\n") ;
        System.out.print(set2) ;
        System.out.print("\nEnter Y for Yes and N for No: ") ;
        s = input.nextLine() ;
        answer = s.charAt(0) ;

        if (Character.toUpperCase(answer) == 'Y') day += 2 ;

        System.out.print("Is your birthday in set3/\n") ;
        System.out.print(set3) ;
        System.out.print("\nEnter Y for Yes and N for No: ") ;
        s = input.nextLine() ;
        answer = s.charAt(0) ;

        if (Character.toUpperCase(answer) == 'Y') day += 3 ;

        System.out.print("Is your birthday in set4/\n") ;
        System.out.print(set4) ;
        System.out.print("\nEnter Y for Yes and N for No: ") ;
        s = input.nextLine() ;
        answer = s.charAt(0) ;

        if (Character.toUpperCase(answer) == 'Y') day += 4 ;

        System.out.print("Is your birthday in set4/\n") ;
        System.out.print(set4) ;
        System.out.print("\nEnter Y for Yes and N for No: ") ;
        s = input.nextLine() ;
        answer = s.charAt(0) ;

        if (Character.toUpperCase(answer) == 'Y') day += 8 ;

        System.out.print("Is your birthday in set5/\n") ;
        System.out.print(set5) ;
        System.out.print("\nEnter Y for Yes and N for No: ") ;
        s = input.nextLine() ;
        answer = s.charAt(0) ;

        if (Character.toUpperCase(answer) == 'Y') day += 16 ;
        System.out.println("\nYour birthday is " + day + "!") ;


    }
}


/*(Guess birthday) Rewrite Listing 4.3, GuessBirthday.java, to prompt the user to
enter the character Y for Yes and N for No, rather than entering 1 for Yes and 0 for
No.

 */
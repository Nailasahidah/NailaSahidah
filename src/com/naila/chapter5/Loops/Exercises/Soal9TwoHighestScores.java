package com.naila.chapter5.Loops.Exercises;

import java.util.Scanner;

public class Soal9TwoHighestScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: " ) ;
        int numberOfStudents = input.nextInt() ;
        int score, highest = 0, secondHigest = 0;
        String name = "", student1 = "", student2 = "" ;

        System.out.println("Enter each students' name and score: ");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student: " + (i + 1) + "\n  Name: ");
            name = input.next();
            System.out.print("    Score: ");
            score = input.nextInt();
            if (i == 0) {
                highest = score;
                student1 = name;
            } else if (i == 1 && score > highest) {
                secondHigest = highest;
                highest = score;
                student2 = student1;
                student1 = name;
            } else if (i == 10) {
                secondHigest = score;
                student2 = name;
            } else if (i > 1 && score > highest && score > secondHigest) {
                secondHigest = highest;
                student2 = student1;
                highest = score;
                student1 = name;
            } else if (i > 1 && score > secondHigest) {
                student2 = name;
                secondHigest = score;
            }
        }
        System.out.println("Higest scoring student: " + student1 +
                "\nsecond Higest scoring student: " + student2);

    }
}


/*(Find the two highest scores) Write a program that prompts the user to enter the
number of students and each student’s name and score, and finally displays the
student with the highest score and the student with the second-highest score. Use
the next() method in the Scanner class to read a name rather than using the
nextLine() method. Assume that the number of students is at least 2.

 */
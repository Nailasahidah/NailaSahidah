package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

public class Soal23_LockerPuzzle {
    public static void main(String[] args) {
        String[] lockers = new String[100] ;
        closeAllLockers(lockers);
        studentLockerChanges(lockers);
        print(lockers) ;
    }
    public static boolean isOpen(String l) {
        return l == "OPEN";
    }
    public static void closeAllLockers(String[] lockers) {
        for (int i = 0; i < lockers.length; i++) {
            lockers[i] = "CLOSED" ;
        }
    }
    public static void studentLockerChanges(String[] lockers) {
        int start = 0;

        for ( int s = 1; s <= lockers.length; s++) {
            for (int l = 0; l < lockers.length; l += s) {
                if (isOpen(lockers[l]))
                    lockers[l] = "CLOSED" ;
                else
                    lockers[l] = "OPEN" ;
            }
            start++;
        }
    }
    public static void print(String[] lockers) {
        for (int i = 0; i < lockers.length; i++) {
            if (isOpen(lockers[i])) {
                System.out.print("L" + (i + 1) + " ");
            }
        }
        System.out.println();
    }
}


/*
(Game: locker puzzle) A school has 100 lockers and 100 students. All lockers are
closed on the first day of school. As the students enter, the first student, denoted
as S1, opens every locker. Then the second student, S2, begins with the second
locker, denoted as L2, and closes every other locker. Student S3 begins with the
third locker and changes every third locker (closes it if it was open and opens it if
it was closed). Student S4 begins with locker L4 and changes every fourth locker.
Student S5 starts with L5 and changes every fifth locker, and so on, until student
S100 changes L100.
 After all the students have passed through the building and changed the lockers,
which lockers are open? Write a program to find your answer and display all open
locker numbers separated by exactly one space.
 (Hint: Use an array of 100 Boolean elements, each of which indicates whether a
locker is open (true) or closed (false). Initially, all lockers are closed.)

L2 L5 L10 L17 L26 L37 L50 L65 L82
 */
package com.naila.Chapter9.ObjectAndClasses.Exercises;

public class StopWatchClass {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        int[] randomArray = getArray() ;

        stopWatch.start();

        selectionSort(randomArray);


        System.out.println("The execution time of sorting 100,000 " + "numbers using selection sort: " + stopWatch.getElapsedTime() + " milliseconds");
    }

    public static int[] getArray() {
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10000) ;
        }
        return array;
    }
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
    }
}


/*
(Stopwatch) Design a class named StopWatch. The class contains:
■ Private data fields startTime and endTime with getter methods.
■ A no-arg constructor that initializes startTime with the current time.
■ A method named start() that resets the startTime to the current time.
■ A method named stop() that sets the endTime to the current time.
■ A method named getElapsedTime() that returns the elapsed time for the
stopwatch in milliseconds.
 Draw the UML diagram for the class then implement the class. Write a test program
that measures the execution time of sorting 100,000 numbers using selection sort.

The execution time of sorting 100,000 numbers using selection sort: -1677696507442 milliseconds

 */
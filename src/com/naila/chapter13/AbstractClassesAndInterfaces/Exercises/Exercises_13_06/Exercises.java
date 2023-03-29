package com.naila.chapter13.AbstractClassesAndInterfaces.Exercises.Exercises_13_06;

public class Exercises {
    public static void main(String[] args) {
        ComparableCircle comparableCircle1 = new ComparableCircle(12.5);
        ComparableCircle comparableCircle2 = new ComparableCircle(18.3);

        System.out.println("\nComparableCircle1: ");
        System.out.println(comparableCircle1);
        System.out.println("\nComparableCircle2: ");
        System.out.println(comparableCircle2);

        System.out.println((comparableCircle1.compareTo(comparableCircle2) == 1
                ? "\nComparableCircle11 " : "\nComparableCircle2 " +
                "is the larger of the two Circles"));
    }
}

/*
ComparableCircle1:
created on Sun Mar 19 20:02:01 PDT 2023
color: while and filled: false
Radius: 12.5
Area: 490.8738521234052
Diameter: 25.0
Perimeter: 78.53981633974483
Area: 490.8738521234052

ComparableCircle2:
created on Sun Mar 19 20:02:01 PDT 2023
color: while and filled: false
Radius: 18.3
Area: 1052.0879637606859
Diameter: 36.6
Perimeter: 114.98229112138644
Area: 1052.0879637606859

ComparableCircle2 is the larger of the two Circles
 */

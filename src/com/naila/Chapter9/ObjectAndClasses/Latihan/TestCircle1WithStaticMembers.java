package com.naila.Chapter9.ObjectAndClasses.Latihan;

public class TestCircle1WithStaticMembers {
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of circle objects is " + Circle1.numberOfObjects);

        Circle1 c1 = new Circle1();

        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");

        Circle1 c2 = new Circle1(5);

        c1.radius = 9;

        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");
        System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects (" + c2.numberOfObjects + ")");

    }
}


/*
Before creating objects
The number of circle objects is 0

After creating c1
c1: radius (1.0) and number of Circle objects (1)

After creating c2 and modifying c1
c1: radius (9.0) and number of Circle objects (2)
c2: radius (5.0) and number of Circle objects (2)
 */
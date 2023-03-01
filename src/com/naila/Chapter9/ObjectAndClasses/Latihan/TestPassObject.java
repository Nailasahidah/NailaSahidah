package com.naila.Chapter9.ObjectAndClasses.Latihan;

public class TestPassObject {
    public static void main(String[] args) {
        Circle3 myCircle = new Circle3(1);

    int n = 5;
    printAreas(myCircle, n);

    System.out.println("\n" + "Radius is " + myCircle.getRadius());
    System.out.println("n is " + n);
    }
    public static void printAreas(Circle3 c, int times) {
        System.out.println("Radius \t\tArea");
        while (times >= 1) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1) ;
            times--;
        }
    }
}

/*
Radius 		Area
1.0		3.141592653589793
2.0		12.566370614359172
3.0		28.274333882308138
4.0		50.26548245743669
5.0		78.53981633974483

Radius is 6.0
n is 5

 */
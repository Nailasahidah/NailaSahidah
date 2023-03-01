package com.naila.Chapter9.ObjectAndClasses.Latihan;

public class TestCircle3WithPrivateDataFields {
    public static void main(String[] args) {
        Circle3 myCircle = new Circle3(5.0);
        System.out.println("The area of the circle of radius " +
                myCircle.getRadius() + " is " + myCircle.getArea());

        myCircle.setRadius(myCircle.getRadius() * 1.1) ;
        System.out.println("The area of the circle of radius " +
                myCircle.getRadius() + " is " + myCircle.getArea());
        System.out.println("The number of objects created is " +
                Circle3.getNumberOfObjects());
    }
}

/*
The area of the circle of radius 5.0 is 78.53981633974483
The area of the circle of radius 5.5 is 95.03317777109125
The number of objects created is 1
 */
package com.naila.chapter13.AbstractClassesAndInterfaces.Exercises.Exercises_13_05;

public class Exercise {
    public static void main(String[] args) {
        Circle circle1 = new Circle(15, "red", true);
        Circle circle2 = new Circle(10, "blue", false);

        System.out.println("\nCircle 1: ");
        print(circle1);

        System.out.println("\nCircle 2: ");
        print(circle2);

        print("\nThe larger of the two circles was ");
        print(Circle.max(circle1, circle2));

        Rectangle rectangle1 = new Rectangle(4, 5, "green", true);
        Rectangle rectangle2 = new Rectangle(4.2, 5, "Orange", true);

        System.out.println("\nRectangle 1: ");
        print(circle1);

        System.out.println("\nRectangle 2: ");
        print(circle2);

        print("\nThe larger of the two rectangles was ") ;
        print(Rectangle.max(rectangle1, rectangle2));
    }
    public static void print(String s) {
        System.out.println(s);
    }
    public static void print(GeometricObject_ o) {
        System.out.println(o);
    }

    /*
    Circle 1:
created on Wed Mar 15 03:36:03 PDT 2023
color: red and filled: true
Radius: 15.0
Area: 706.8583470577034
Diameter: 30.0
Perimeter: 94.24777960769379

Circle 2:
created on Wed Mar 15 03:36:03 PDT 2023
color: blue and filled: false
Radius: 10.0
Area: 314.1592653589793
Diameter: 20.0
Perimeter: 62.83185307179586

The larger of the two circles was
created on Wed Mar 15 03:36:03 PDT 2023
color: red and filled: true
Radius: 15.0
Area: 706.8583470577034
Diameter: 30.0
Perimeter: 94.24777960769379

Rectangle 1:
created on Wed Mar 15 03:36:03 PDT 2023
color: red and filled: true
Radius: 15.0
Area: 706.8583470577034
Diameter: 30.0
Perimeter: 94.24777960769379

Rectangle 2:
created on Wed Mar 15 03:36:03 PDT 2023
color: blue and filled: false
Radius: 10.0
Area: 314.1592653589793
Diameter: 20.0
Perimeter: 62.83185307179586

The larger of the two rectangles was
created on Wed Mar 15 03:36:03 PDT 2023
color: Orange and filled: true
Width: 4.2
Height: 5.0
Area: 21.0
Perimeter: 42.0

Process finished with exit code 0
     */
}

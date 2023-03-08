package com.naila.chapter13.AbstractClassesAndInterfaces.Latihan;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricalObject geoObject1 = new Circle(5);
        GeometricalObject geoObject2 = new Rectangle(5, 3);

        System.out.println("The two objects have the same area? " + equalArea(geoObject1, geoObject2));

        displayGeometricObject(geoObject1);
        displayGeometricObject(geoObject2);
    }
    public static boolean equalArea(GeometricalObject object1,
                                    GeometricalObject object2) {
        return object1.getArea() == object2.getArea();
    }
    public static void displayGeometricObject(GeometricalObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}

/*
The two objects have the same area? false

The area is 78.53981633974483
The perimeter is 31.41592653589793

The area is 15.0
The perimeter is 16.0
 */
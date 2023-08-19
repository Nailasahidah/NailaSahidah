package com.naila.latihan;

import java.sql.SQLOutput;

abstract class shape {
    abstract double calculateArea();

    public abstract String Printable();
}
class Circle extends shape{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String Printable() {
        return null;
    }
}

class Rectangle extends shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    public String Printable() {
        return null;
    }
}

class Triangle extends shape {
    private double alas;
    private double tinggi;

    public Triangle(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    double calculateArea() {
        return 1.0/2 * (alas * tinggi);
    }
    @Override
    public String Printable () {
        return null;
     }
}

class main {
    public static void main(String[] args) {
        shape circle = new Circle(5);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Informasi Circle: " + new Printable() {
            @Override
            public void printInfo() {

            }
        });

        shape rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        shape triangle = new Triangle(12, 3);
        System.out.println("Triangle area: " + triangle.calculateArea());
    }
}


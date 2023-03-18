package com.naila.Chapter9.ObjectAndClasses.Ujian_PBO.Soal8_;

class Rectangle extends  Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }
}

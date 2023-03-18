package com.naila.Chapter9.ObjectAndClasses.Ujian_PBO.Soal8_;

abstract class Shape {
    String color;

    void setColor(String color) {
        this.color = color;
    }
    String getColor() {
        return this.color;
    }

    abstract  double getArea();
}


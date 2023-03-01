package com.naila.Chapter11.InheritanceAndPolymorphism.Latihan;

public class GeometricalObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricalObject() {
        dateCreated = new java.util.Date();
    }
    public GeometricalObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }

}

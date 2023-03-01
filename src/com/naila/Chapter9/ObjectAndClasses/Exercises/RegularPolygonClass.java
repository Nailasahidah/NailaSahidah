package com.naila.Chapter9.ObjectAndClasses.Exercises;

public class RegularPolygonClass {
    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("\n---------------------------------------------------");
        System.out.println("|  Regular Polygon Objects |  Perimeter  |  Area   |");
        System.out.println("----------------------------------------------------");
        System.out.printf("|         Object# 1        |%8.2f     |%6.2f   |\n",
                regularPolygon1.getPerimeter(), regularPolygon1.getArea());
        System.out.printf("|         Object# 2        |%8.2f     |%6.2f   |\n",
                regularPolygon2.getPerimeter(), regularPolygon2.getArea());
        System.out.printf("|         Object# 3        |%8.2f     |%6.2f   |\n",
                regularPolygon3.getPerimeter(), regularPolygon3.getArea());
        System.out.println("---------------------------------------------------");

    }
}


/*
---------------------------------------------------
|  Regular Polygon Objects |  Perimeter  |  Area  |
----------------------------------------------------
|         Object# 1        |    3.00     |  0.43   |
|         Object# 2        |   24.00     | 41.57   |
|         Object# 3        |   40.00     |123.11   |
---------------------------------------------------

 */
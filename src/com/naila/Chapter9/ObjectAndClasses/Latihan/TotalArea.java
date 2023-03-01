package com.naila.Chapter9.ObjectAndClasses.Latihan;

public class TotalArea {
    public static void main(String[] args) {
        Circle3[] circleArray;

        circleArray = createCircleArray();

        printCircleArray(circleArray);
    }
    public static Circle3[] createCircleArray() {
        Circle3[] circleArray = new Circle3[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle3(Math.random() * 100);
        }
        return circleArray;
    }
    public static void printCircleArray(Circle3[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30s%-15s\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }
        System.out.println("________________________________");

        System.out.printf("%-30s%-15s\n", "The total area of circles is", sum(circleArray));
    }
    public static double sum(Circle3[] circleArray) {
        double sum = 0;

        for (int i = 0; i < circleArray.length; i++)
            sum += circleArray[i].getArea();

        return sum;
    }
}

/*
Radius                        Area
63.26643944421249             12574.671832960596
12.542144181419912            494.18942827524353
96.78484233207175             29428.258787524264
34.14908923120203             3663.600616687296
74.82597776733317             17589.547770453613
________________________________
The total area of circles is  63750.268435901016

 */
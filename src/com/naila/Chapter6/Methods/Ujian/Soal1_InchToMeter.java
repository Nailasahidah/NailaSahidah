package com.naila.Chapter6.Methods.Ujian;

public class Soal1_InchToMeter {
    public static void main(String[] args) {
        System.out.println("\nInch     Meters       |        Meters      Inch\n" +
                "------------------------------------------------");
        for (double inch = 1, meters = 1 ;
        inch <=100; inch++,meters += 1.0 ) {
                System.out.printf("%4.1f     ",   inch);
                System.out.printf("%6.4f", inchToMeter(inch));
                System.out.printf("       |       ");
                System.out.printf("%6.1f     ",   meters);
                System.out.printf("%6.4f\n",     meterToInch(meters)) ;
            }
        }
        public static double inchToMeter(double inch) {
            return 0.0254 * inch ;
        }
        public static double meterToInch(double meter) {
            return 39.3701 * meter;
    }
}

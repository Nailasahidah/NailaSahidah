package com.naila.Chapter12.ExceptionHandlingAndTextIO.Latihan;

public class TestException {
    public static void main(String[] args) {
        try {
            System.out.println(sum(new int[] {1, 2, 3, 4, 5}));
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("\n" + ex.getMessage());
            System.out.println("\n" + ex.toString());

            System.out.println("\nTrace Info Obtained from getStackTrace");
            StackTraceElement[] traceElements = ex.getStackTrace();
            for (int i = 0; i < traceElements.length; i++) {
                System.out.print("method " + traceElements[i].getMethodName());
                System.out.print("(" + traceElements[i].getClassLoaderName());
                System.out.print(traceElements[i].getLineNumber() + ")");
            }
        }
    }
    private static int sum(int[] list) {
        int result = 0;
        for (int i = 0; i <= list.length; i++)
            result += list[i];
        return result;
    }
}


/*
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at com.naila.Chapter12.ExceptionHandlingAndTextIO.Latihan.TestException.sum(TestException.java:25)
	at com.naila.Chapter12.ExceptionHandlingAndTextIO.Latihan.TestException.main(TestException.java:6)

Index 5 out of bounds for length 5

java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

Trace Info Obtained from getStackTrace
method sum(app25)method main(app6)
Process finished with exit code 0
 */
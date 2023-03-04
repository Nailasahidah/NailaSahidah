package com.naila.Chapter12.ExceptionHandlingAndTextIO.Latihan;

public class ChainedExceptionDemo {
    public static void main(String[] args) {
        try {
            method1() ;
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void method1() throws Exception {
        try {
            method2();
        }
        catch (Exception ex) {
            throw new Exception("New info from method1", ex) ;
        }
    }
    public static void method2() throws Exception {
        throw new Exception("New info from method2");
    }
}

/*
java.lang.Exception: New info from method1
	at com.naila.Chapter12.ExceptionHandlingAndTextIO.Latihan.ChainedExceptionDemo.method1(ChainedExceptionDemo.java:17)
	at com.naila.Chapter12.ExceptionHandlingAndTextIO.Latihan.ChainedExceptionDemo.main(ChainedExceptionDemo.java:6)
Caused by: java.lang.Exception: New info from method2
	at com.naila.Chapter12.ExceptionHandlingAndTextIO.Latihan.ChainedExceptionDemo.method2(ChainedExceptionDemo.java:21)
	at com.naila.Chapter12.ExceptionHandlingAndTextIO.Latihan.ChainedExceptionDemo.method1(ChainedExceptionDemo.java:14)
	... 1 more

 */

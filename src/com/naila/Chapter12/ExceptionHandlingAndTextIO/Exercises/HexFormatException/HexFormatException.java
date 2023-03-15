package com.naila.Chapter12.ExceptionHandlingAndTextIO.Exercises.HexFormatException;

public class HexFormatException extends Throwable {
    private String hex;

    public HexFormatException(String hex) {
        super(hex + " is not a hex string");
        this.hex = hex;
    }
    public String getHex() {
        return hex;
    }
}

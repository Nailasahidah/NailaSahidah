package com.naila.Chapter17.BinaryIO.Latihan;
import java.io.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Listing2_TestDataStream {
    public static void main(String[] args) {
        try (
                DataOutputStream output =
                        new DataOutputStream(new FileOutputStream("temp.dat"));
        ) {
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeUTF("Susan");
            output.writeDouble(185.5);
            output.writeUTF("Kim");
            output.writeDouble(105.25);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
        ) {
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

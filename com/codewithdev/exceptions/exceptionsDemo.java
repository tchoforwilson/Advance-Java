package com.codewithdev.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.FileReader;

public class ExceptionsDemo {
    public static void show() {
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("null");

        } catch (IOException | ParseException e) {
            System.out.println("Could not read data.");
        }
    }
}
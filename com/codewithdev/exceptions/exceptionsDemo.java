package com.codewithdev.exceptions;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class ExceptionsDemo {
    public static void show() {
        try (
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("some.txt")) {
            var value = reader.read();

        } catch (IOException e) {
            System.out.println("Could not read data.");
        }
    }
}
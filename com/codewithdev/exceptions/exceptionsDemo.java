package com.codewithdev.exceptions;

import java.io.IOException;
import java.io.FileReader;

public class ExceptionsDemo {
    public static void show() {
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
            var value = reader.read();

        } catch (IOException e) {
            System.out.println("Could not read data.");
        } finally {
            if (reader != null)
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
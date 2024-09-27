package com.codewithdev.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {
    public static void show() {
        try {
            var reader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
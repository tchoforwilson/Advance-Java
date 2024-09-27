package com.codewithdev.exceptions;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class ExceptionsDemo {
    public static void show() {
        var account = new Account();
        try {
            account.deposit(-1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
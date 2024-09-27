package com.codewithdev.exceptions;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class ExceptionsDemo {
    public static void show() throws IOException {
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            var cause = e.getCause();
            System.out.println(cause.getMessage());
        }
    }
}
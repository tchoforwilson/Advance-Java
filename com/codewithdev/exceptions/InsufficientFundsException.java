package com.codewithdev.exceptions;

// Checked -> Exception
// Unchecked -> (runtime) -> Runtime

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Insufficient funds in your account.");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
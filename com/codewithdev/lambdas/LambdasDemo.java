package com.codewithdev.lambdas;

public class LambdasDemo {
    public String prefix = "-";

    public void show() {

        greet(message -> System.out.println(prefix + message));
    }

    public static void greet(Printer printer) {
        printer.print("Hello world!");
    }
}

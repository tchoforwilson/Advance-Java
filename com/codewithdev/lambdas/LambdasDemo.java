package com.codewithdev.lambdas;

public class LambdasDemo {
    public LambdasDemo(String message) {

    }

    public static void show() {
        greet(LambdasDemo::new);
        greet(LambdasDemo::new);
    }

    public static void greet(Printer printer) {
        printer.print("Hello world!");
    }
}

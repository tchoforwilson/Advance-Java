package com.codewithdev.lambdas;

import java.util.function.Supplier;

public class LambdasDemo {

    public static void show() {
        Supplier<Double> getRandom = () -> Math.random();
        var random = getRandom.get();
        System.out.println(random);
    }
}

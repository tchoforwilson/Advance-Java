package com.codewithdev.lambdas;

import java.util.function.Function;
import java.util.function.Supplier;

public class LambdasDemo {

    public static void show() {
        Function<String, Integer> map = str -> str.length();
        var length = map.apply("Sky");
        System.out.println(length);
    }
}

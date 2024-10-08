package com.codewithdev.lambdas;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdasDemo {

    public static void show() {
        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

        Predicate<String> hasLeftAndRightBrace = hasLeftBrace.and(hasRightBrace);
        var result = hasLeftAndRightBrace.test("{key:vale}");
        System.out.println(result);
    }
}

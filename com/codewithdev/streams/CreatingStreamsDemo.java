package com.codewithdev.streams;

import java.util.Arrays;
import java.util.Collection;

public class CreatingStreamsDemo {
    public static void show() {
        int[] numbers = { 1, 2, 3 };
        Arrays.stream(numbers).forEach(n -> System.out.println(n));
    }
}

package com.codewithdev.streams;

import java.util.stream.IntStream;

public class PrimitiveTypeStreamsDemo {
    public static void show() {
        IntStream.range(1, 5)
                .forEach(System.out::println);
    }
}

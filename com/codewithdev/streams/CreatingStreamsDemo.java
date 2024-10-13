package com.codewithdev.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show() {
        var stream = Stream.generate(() -> Math.random());
        stream.limit(3).forEach(e -> System.out.println(e));
    }
}

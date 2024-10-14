package com.codewithdev.streams;

import java.util.List;

public class ReducersDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("Terminator", 10),
                new Movie("Anaconda", 15),
                new Movie("Avatar", 30),
                new Movie("Secreet Road", 20));

        var result = movies.stream().findFirst().get();

        System.out.println(result.getTitle());

    }
}

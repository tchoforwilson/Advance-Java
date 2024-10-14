package com.codewithdev.streams;

import java.util.List;

public class UniqueElementsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("Terminator", 10),
                new Movie("Anaconda", 10),
                new Movie("Avatar", 30),
                new Movie("Secreet Road", 20));

        movies.stream()
                .map(Movie::getLikes)
                .distinct()
                .forEach(System.out::println);

    }
}

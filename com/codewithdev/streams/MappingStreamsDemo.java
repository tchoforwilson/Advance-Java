package com.codewithdev.streams;

import java.util.List;

public class MappingStreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("Terminator", 10),
                new Movie("Avatar", 15),
                new Movie("Secret Road", 20));

        movies.stream().map(movie -> movie.getTitle()).forEach(title -> System.out.println(title));
    }
}

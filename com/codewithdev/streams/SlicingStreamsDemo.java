package com.codewithdev.streams;

import java.util.List;

public class SlicingStreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("Terminator", 10),
                new Movie("Avatar", 30),
                new Movie("Secreet Road", 20));

        movies.stream().dropWhile(movie -> movie.getLikes() < 30)
                .forEach(movie -> System.out.println(movie.getTitle()));
    }
}

package com.codewithdev.streams;

import java.util.Comparator;
import java.util.List;

public class SortingStreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("Terminator", 10),
                new Movie("Avatar", 30),
                new Movie("Secreet Road", 20));

        movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle).reversed())
                .forEach(movie -> System.out.println(movie.getTitle()));
    }
}

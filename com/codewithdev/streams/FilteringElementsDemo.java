package com.codewithdev.streams;

import java.util.List;
import java.util.function.Predicate;

public class FilteringElementsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("Terminator", 10),
                new Movie("Avatar", 15),
                new Movie("Secreet Road", 20));

        Predicate<Movie> isPopular = movie -> movie.getLikes() > 10;

        movies.stream().filter(isPopular).forEach(movie -> System.out.println(movie.getTitle()));
    }
}

package com.codewithdev.streams;

import java.util.List;

public class PeekingElementsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("Terminator", 10),
                new Movie("Anaconda", 15),
                new Movie("Avatar", 30),
                new Movie("Secreet Road", 20));

        movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .peek(movie -> System.out.println("Filtered: " + movie.getTitle()))
                .map(Movie::getTitle)
                .peek(title -> System.out.println("Mapped: " + title))
                .forEach(System.out::println);

    }
}

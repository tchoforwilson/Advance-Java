package com.codewithdev.streams;

import java.util.List;
import java.util.stream.Collectors;

public class GroupingElementDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("Terminator", 10, Genre.ACTION),
                new Movie("Anaconda", 15, Genre.TRHILLER),
                new Movie("Avatar", 30, Genre.ACTION),
                new Movie("Secreet Road", 20, Genre.COMEDY));

        // Key (title)
        // value (likes)

        var result = movies.stream()
                .collect(Collectors.mapping(Movie::getTitle,
                        Collectors.joining(", ")));

        System.out.println(result);
    }
}

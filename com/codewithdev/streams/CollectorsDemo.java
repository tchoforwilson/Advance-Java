package com.codewithdev.streams;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("Terminator", 10),
                new Movie("Anaconda", 15),
                new Movie("Avatar", 30),
                new Movie("Secreet Road", 20));

        // Key (title)
        // value (likes)

        var result = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.toMap(Movie::getTitle, Movie::getLikes));

        System.out.println(result);
    }
}

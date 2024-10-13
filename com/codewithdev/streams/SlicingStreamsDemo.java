package com.codewithdev.streams;

import java.util.List;

public class SlicingStreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("Terminator", 10),
                new Movie("Avatar", 15),
                new Movie("Secreet Road", 20));

        // 1000 movies
        // 10 movies per page
        // 3rd page
        // skip(20) = skip((page - 1) x pageSize)
        // limit(10) = limit(pageSize)
        movies.stream().skip(2).forEach(movie -> System.out.println(movie.getTitle()));
    }
}

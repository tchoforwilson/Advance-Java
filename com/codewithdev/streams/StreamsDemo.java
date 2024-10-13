package com.codewithdev.streams;

import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("Terminator", 10),
                new Movie("Avatar", 15),
                new Movie("Secreet Road", 20));

        int count = 0;
        for (var movie : movies) {
            if (movie.getLikes() > 10) {
                count++;
            }
        }

        var count2 = movies.stream().filter(movie -> movie.getLikes() > 10).count();
        System.out.println(count2);
    }
}

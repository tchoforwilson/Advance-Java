package com.codewithdev.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ReducersDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("Terminator", 10),
                new Movie("Anaconda", 15),
                new Movie("Avatar", 30),
                new Movie("Secreet Road", 20));

        // [10, 15, 30, 20]
        // [25, 30, 20]
        // [55, 20]
        // [75]
        Optional<Integer> sum = movies.stream()
                .map(movie -> movie.getLikes())
                .reduce(Integer::sum);

        System.out.println(sum.orElse(0));

    }
}

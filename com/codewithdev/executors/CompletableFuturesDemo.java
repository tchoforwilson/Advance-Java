package com.codewithdev.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;

public class CompletableFuturesDemo {
    public static void show() {
        var future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting the current weather");
            throw new IllegalStateException();
        });

        try {
            var temperature = future.exceptionally(ex -> 1).get();
            System.out.println(temperature);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
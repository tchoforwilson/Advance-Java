package com.codewithdev.collections;

import java.util.*;

public class MapDemo {
    public static void show() {
        var customer1 = new Customer("Mary", "mary@example.com");
        var customer2 = new Customer("James", "james@example.com");
        Map<String, Customer> map = new HashMap<>();
        map.put(customer1.getEmail(), customer1);
        map.put(customer2.getEmail(), customer2);

        var unknown = new Customer("Unknown", "");
        var exists = map.containsKey("jean@example.com");
        System.out.println(exists);
    }
}

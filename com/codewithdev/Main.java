package com.codewithdev;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import com.codewithdev.collections.Customer;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer("James"));
        customers.add(new Customer("Brown"));
        customers.add(new Customer("Mary"));

        Collections.sort(customers);
        System.out.println(customers);
    }
}
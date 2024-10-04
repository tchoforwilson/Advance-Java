package com.codewithdev;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import com.codewithdev.collections.Customer;
import com.codewithdev.collections.EmailComparator;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer("James", "james@example.com"));
        customers.add(new Customer("Brown", "rown@example.com"));
        customers.add(new Customer("Mary", "ary@example.com"));

        Collections.sort(customers, new EmailComparator());
        System.out.println(customers);
    }
}